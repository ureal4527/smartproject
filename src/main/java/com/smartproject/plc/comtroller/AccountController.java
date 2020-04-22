package com.smartproject.plc.comtroller;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.smartproject.plc.dao.AccountDAO;
import com.smartproject.plc.service.AccountServiceImp;
import com.smartproject.plc.vo.accountVO;


@Controller
public class AccountController {

	@Autowired
	AccountServiceImp service;
	
    @RequestMapping(value="/")
    public String login() throws Exception {
    	
        return "login";
    }
    
    @RequestMapping(value="join.do")
    public String join() throws Exception {
    	
        return "join";
    }

 // 로그아웃 처리 : 로그아웃 버튼을 누르면 login 화면으로 이동
	@RequestMapping("logout.do")
	public String logout(HttpSession session, Model model) {
		session.removeAttribute("user_id");
		session.invalidate();
		return "redirect:/";
	}
	// id 중복확인
		@RequestMapping("checkid.do")
		public @ResponseBody String checkid(@RequestParam("userid") String id){
			String str = "";
			int idcheck = service.checkid(id);
			if(idcheck==1){ //이미 존재하는 계정
				str = "NO";	
			}else{	//사용 가능한 계정
				str = "YES";	
			}
			return str;
		}
		
		@RequestMapping("joinok.do")
		public String joinok(HttpServletRequest requset, HttpServletResponse response) throws Exception {
			
			HashMap<String, String> account= new HashMap<>(); 
			account.put("user_id", requset.getParameter("user_id"));
			account.put("user_pw", requset.getParameter("user_pw"));
			account.put("user_name", requset.getParameter("user_name"));
			account.put("farm_name", requset.getParameter("farm_name"));
		/*
		 * System.out.println(account); String farmname =
		 * requset.getParameter("farm_name"); System.out.println(farmname);
		 */
			int farmcheck = service.checkfarm(requset.getParameter("farm_name"));
			System.out.println(farmcheck);
			if(farmcheck == 0) { //데이터베이스에 소속 농장 계정이 없을때(관리자부여)
				
				
				account.put("authority", "admin");
				account.put("flag","1");
				
				service.insertAccount(account);
				
				response.setContentType("text/html; charset=UTF-8");
		        PrintWriter out = response.getWriter();
		        out.println("<script>alert('관리자 계정으로 가입되었습니다.');</script>");
		        out.flush();
				
			} else {//	데이터베이스에 소속 농장 계정이 있을때
				
				account.put("authority", "user");
				account.put("flag","0");
				
				service.insertAccount(account);
				
				response.setContentType("text/html; charset=UTF-8");
		        PrintWriter out = response.getWriter();
		        out.println("<script>alert('일반사용자 계정으로 가입되었습니다.\\n 로그인 시 접근권한이 필요하니 관리자에게 문의바랍니다.');</script>");
		        out.flush();
		        
			}
			
			
	        
			return "login";
		}
		
		@RequestMapping("loginok.do")
		public String loginok(HttpSession session,HttpServletRequest request, HttpServletResponse response, accountVO vo, Model model) throws Exception {
			
			HashMap<String, String> account = new HashMap<>(); 
			account.put("user_id", request.getParameter("user_id"));
			account.put("user_pw", request.getParameter("user_pw"));
			System.out.println(account);
			session = request.getSession(true);
			System.out.println(service.loginCheck(account));
			if(service.loginCheck(account) == 1) {
				
				if(service.flagCheck(account) == 1) {
					session.setAttribute("user_id", vo.getUser_id());
					return "redirect:splash.do";
				} else {
					response.setContentType("text/html; charset=UTF-8");
		            PrintWriter out = response.getWriter();
		            out.println("<script>alert('접속권한이없습니다.관리자에게 문의하세요.'); history.go(-1);</script>");
		            out.flush();
		            return "login";
				}
				
			}else { // �α��� ���н� alert
				response.setContentType("text/html; charset=UTF-8");
	            PrintWriter out = response.getWriter();
	            out.println("<script>alert('로그인정보를 확인하세요.'); history.go(-1);</script>");
	            out.flush();
	            return "login";
			}
			
		}
		
		
	    @RequestMapping(value="account_setting.do")
	    public String account(@SessionAttribute("user_id") String user_id, Model model, accountVO vo) throws Exception {
	    	model.addAttribute("info", service.account(user_id));
	    	
	    	vo = service.account(user_id);
	    	String farm_name = vo.getFarm_name();
	    	
	    	model.addAttribute("list", service.accountList(farm_name));
	    	
	        return "/dashboard/account_setting";
	    }
	    
		//  ���ٱ������
		@RequestMapping("account_permit.do")
		public String account_permit(HttpServletRequest requset) {
			String user_id = requset.getParameter("user_id");

			service.permit(user_id);
			
			return "redirect:account_setting.do";
		}
		
		//  ��������
		@RequestMapping("account_delete.do")
		public String account_delete(HttpServletRequest requset) {
			String user_id = requset.getParameter("user_id");

			service.deleteAccount(user_id);
			
			return "redirect:account_setting.do";
		}
	
}
