package com.smartproject.plc.service;

import java.util.List;
import java.util.Map;

import com.smartproject.plc.vo.accountVO;

public interface AccountService {
	public int checkid(String user_id); //id 以묐났�솗�씤
	public int checkfarm(String farm_name); //�냼�냽�솗�씤
	public void insertAccount(Map account); //�쉶�썝媛��엯
	public int loginCheck(Map account); //濡쒓렇�씤
	public int flagCheck(Map account); //�젒洹쇨텒�븳
	
	public accountVO account(String user_id); //�긽�꽭�젙蹂�
	public List<accountVO> accountList(String farm_name); //怨꾩젙 由ъ뒪�듃(媛숈��냼�냽)
	public void permit(String user_id); //�젒洹쇳뿀�슜
	public void deleteAccount(String user_id); //怨꾩젙�궘�젣
}
