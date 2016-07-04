package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.awm.bm.model.Account;
import com.awm.bm.persistence.Provider.AccountProvider;

/**
 * 数据层接口
 * 
 * @author Administrator
 * 
 */
@Mapper
public interface AccountMapper {
	/**
	 * 添加用户信息
	 * 
	 * @param account
	 */
	@Insert("insert into account values(#{id})")
	public int addAccount(@Param("id") Account account);

	/**
	 * 根据id和密码查询用户 验证登录
	 * 
	 * @param id
	 * @param pwd
	 * @return
	 */
	@Select("select * from account where id=#{id} and password=#{pwd}")
	public Account findUserByIdAndPwd(@Param("id") Integer id, @Param("pwd") String pwd);

	/**
	 * 根据id修改密码
	 * 
	 * @param id
	 * @param pwd
	 * @return
	 */
	@Update("update account set password=#{pwd} where id=#{id}")
	public int modifyUserPwdById(@Param("id") Integer id, @Param("pwd") String pwd);

	/**
	 * 根据id修改员工信息
	 * 
	 * @param account
	 * @return
	 */
	@UpdateProvider(type = AccountProvider.class, method = "modifyUser")
	public int modifyUserById(@Param("account") Account account);

	/**
	 * 根据id修改员工的状态
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	@Update("update account set state=#{state} where id=#{id}")
	public int modifyUserStateById(@Param("id") Integer id, @Param("state") Integer state);

	/**
	 * 查询业务员的信息
	 * 
	 * @return
	 */
	@Select("select * from account where level=0")
	public List<Account> findUser();

	/**
	 * 查询员工的信息
	 * 
	 * @return
	 */
	@Select("select * from account")
	public List<Account> findUsers();

	/**
	 * 根据id查询员工信息
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from account where id=#{id}")
	public Account findUsersById(@Param("id") Integer id);

	/**
	 * 根据条件查询业务员的信息
	 * 
	 * @param account
	 * @return
	 */
	@SelectProvider(type = AccountProvider.class, method = "findUser")
	public List<Account> findUserByCondition(@Param("account") Account account);

	/**
	 * 根据条件查询员工的信息
	 * 
	 * @param account
	 * @return
	 */
	@SelectProvider(type = AccountProvider.class, method = "findUsers")
	public List<Account> findUsersByCondition(@Param("account") Account account);

}