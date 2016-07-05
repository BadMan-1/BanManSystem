package com.awm.bm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awm.bm.model.Account;
import com.awm.bm.persistence.AccountMapper;

/**
 * �����
 * 
 * @author Administrator
 * 
 */
@Service(value = "AccountService")
public class AccountService {

	@Autowired
	/**
	 * ���ݲ�ӿڶ���
	 */
	private AccountMapper accountMapper;

	/**
	 * ����û���Ϣ
	 * 
	 * @param account
	 * @return
	 */
	public int addAccount(Account account) {
		return accountMapper.addAccount(account);
	}

	/**
	 * ����id�������ѯ�û� ��֤��¼
	 * 
	 * @param account
	 * @return
	 */
	public Account findUser(Integer id, String pwd) {
		return accountMapper.findUserByIdAndPwd(id, pwd);
	}

	/**
	 * ����id�޸�Ա����Ϣ
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUser(Account account) {
		return accountMapper.modifyUserById(account);
	}

	/**
	 * ����id�޸�����
	 * 
	 * @param id
	 * @param pwd
	 * @return
	 */
	public int modifyUserPwd(Integer id, String pwd) {
		return accountMapper.modifyUserPwdById(id, pwd);
	}

	/**
	 * ��ѯ����ҵ��Ա����Ϣ
	 * 
	 * @return
	 */
	public List<Account> findUser() {
		return accountMapper.findUser();
	}

	/**
	 * ��ѯ����Ա������Ϣ
	 * 
	 * @return
	 */
	public List<Account> findUsers() {
		return accountMapper.findUsers();
	}

	/**
	 * ����id��ѯԱ����Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public Account findUsersById(Integer id) {
		return accountMapper.findUsersById(id);
	};

	/**
	 * ����������ѯҵ��Ա����Ϣ
	 * 
	 * @param account
	 * @return
	 */

}