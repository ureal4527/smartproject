package com.smartproject.plc.dao;

import java.util.List;
import java.util.Map;

import com.smartproject.plc.vo.accountVO;

public interface AccountDAO {

	public int checkid(String user_id); //id �ߺ�Ȯ��
	public int checkfarm(String farm_name); //�Ҽ�Ȯ��
	public void insertAccount(Map account); //ȸ������
	public int loginCheck(Map account); //�α���
	public int flagCheck(Map account); //���ٱ���
	
	public accountVO account(String user_id); //������
	public List<accountVO> accountList(String farm_name); //���� ����Ʈ(�����Ҽ�)
	public void permit(String user_id); //�������
	public void deleteAccount(String user_id); //��������
	
	
}
