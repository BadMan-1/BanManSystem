package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.awm.bm.model.Client;
import com.awm.bm.persistence.Provider.ClientProvider;

@Mapper
public interface ClientMapper {
	/**
	 * 添加客户
	 * 
	 * @param client
	 * @return
	 */
	@Insert("insert into client values(#{client})")
	public int addClient(@Param("client") Client client);

	/**
	 * 修改客户信息
	 * 
	 * @param client
	 * @return
	 */
	@UpdateProvider(type = ClientProvider.class, method = "modifyClient")
	public int modifyClient(@Param("client") Client client);

	/**
	 * 修改客户状态
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	@Update("update client set state=#{state} where id=#{id}")
	public int modifyClientState(@Param("id") Integer id, @Param("state") Integer state);

	/**
	 * 根据id查找客户
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from client where id=#{id}")
	public Client findClientById(@Param("id") Integer id);

	/**
	 * 查询所有客户
	 * 
	 * @return
	 */
	@Select("select * from client")
	public List<Client> findClients();
	/**
	 * 根据条件查找客户
	 * @param client
	 * @return
	 */
	@SelectProvider(type=ClientProvider.class,method="findClientsByCondition")
	public List<Client> findClientsByCondition(@Param("client")Client client);
}
