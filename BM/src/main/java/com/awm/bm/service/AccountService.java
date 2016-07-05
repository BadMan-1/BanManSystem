package com.awm.bm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awm.bm.model.Account;
import com.awm.bm.persistence.AccountMapper;

/**
 * 服务层
 * 
 * @author Administrator
 * 
 */
@Service(value = "AccountService")
public class AccountService {

	@Autowired
	/**
	 * 数据层接口对象
	 */
	private AccountMapper accountMapper;

	/**
	 * 添加用户信息
	 * 
	 * @param account
	 * @return
	 */
	public int addAccount(Account account) {
		return accountMapper.addAccount(account);
	}

	/**
	 * 根据id和密码查询用户 验证登录
	 * 
	 * @param account
	 * @return
	 */
	public Account findUser(Integer id, String pwd) {
		return accountMapper.findUserByIdAndPwd(id, pwd);
	}

	/**
	 * 根据id修改员工信息
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUser(Account account) {
		return accountMapper.modifyUserById(account);
	}

	/**
	 * 根据id修改密码
	 * 
	 * @param id
	 * @param pwd
	 * @return
	 */
	public int modifyUserPwd(Integer id, String pwd) {
		return accountMapper.modifyUserPwdById(id, pwd);
	}

	/**
	 * 查询所有业务员的信息
	 * 
	 * @return
	 */
	public List<Account> findUser() {
		return accountMapper.findUser();
	}

	/**
	 * 查询所有员工的信息
	 * 
	 * @return
	 */
	public List<Account> findUsers() {
		return accountMapper.findUsers();
	}

	/**
	 * 根据id查询员工信息
	 * 
	 * @param id
	 * @return
	 */
	public Account findUsersById(Integer id) {
		return accountMapper.findUsersById(id);
	};

	/**
	 * 根据条件查询业务员的信息
	 * 
	 * @param account
	 * @return
	 */

}