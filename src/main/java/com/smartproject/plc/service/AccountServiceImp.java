package com.smartproject.plc.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartproject.plc.dao.AccountDAO;
import com.smartproject.plc.vo.accountVO;

@Service
public class AccountServiceImp implements AccountService {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public int checkid(String user_id) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.checkid(user_id);
	}

	@Override
	public int checkfarm(String farm_name) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.checkfarm(farm_name);
	}

	@Override
	public void insertAccount(Map account) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		dao.insertAccount(account);
	}

	@Override
	public int loginCheck(Map account) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.loginCheck(account);
	}

	@Override
	public int flagCheck(Map account) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.flagCheck(account);
	}

	@Override
	public accountVO account(String user_id) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.account(user_id);
	}

	@Override
	public List<accountVO> accountList(String farm_name) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		return dao.accountList(farm_name);
	}

	@Override
	public void permit(String user_id) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		dao.permit(user_id);
	}

	@Override
	public void deleteAccount(String user_id) {
		AccountDAO dao = sqlSession.getMapper(AccountDAO.class);
		dao.deleteAccount(user_id);
	}

}
