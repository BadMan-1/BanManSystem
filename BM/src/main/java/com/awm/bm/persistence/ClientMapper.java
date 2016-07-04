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
	 * ��ӿͻ�
	 * 
	 * @param client
	 * @return
	 */
	@Insert("insert into client values(#{client})")
	public int addClient(@Param("client") Client client);

	/**
	 * �޸Ŀͻ���Ϣ
	 * 
	 * @param client
	 * @return
	 */
	@UpdateProvider(type = ClientProvider.class, method = "modifyClient")
	public int modifyClient(@Param("client") Client client);

	/**
	 * �޸Ŀͻ�״̬
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	@Update("update client set state=#{state} where id=#{id}")
	public int modifyClientState(@Param("id") Integer id, @Param("state") Integer state);

	/**
	 * ����id���ҿͻ�
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from client where id=#{id}")
	public Client findClientById(@Param("id") Integer id);

	/**
	 * ��ѯ���пͻ�
	 * 
	 * @return
	 */
	@Select("select * from client")
	public List<Client> findClients();
	/**
	 * �����������ҿͻ�
	 * @param client
	 * @return
	 */
	@SelectProvider(type=ClientProvider.class,method="findClientsByCondition")
	public List<Client> findClientsByCondition(@Param("client")Client client);
}
