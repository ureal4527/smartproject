package com.smartproject.plc.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeCotroller {
	
	@RequestMapping(value="index.do")
    public String index() throws Exception {
    	
        return "index";
    }
	
	@RequestMapping(value="splash.do")
    public String splash() throws Exception {
    	
        return "splash";
    }
	
}
