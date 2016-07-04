package com.awm.bm.service;

import java.util.List;


import com.awm.bm.model.Client;
import com.awm.bm.persistence.ClientMapper;

public class OrderService {
	private ClientMapper clientmapper;

	/**
	 * 添加客户
	 * 
	 * @param client
	 * @return
	 */
	public int addClient(Client client) {
		return clientmapper.addClient(client);
	}

	/**
	 * 修改客户信息
	 * 
	 * @param client
	 * @return
	 */
	public int modifyClient(Client client) {
		return clientmapper.modifyClient(client);
	}

	/**
	 * 修改客户状态
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	public int modifyClientState(Integer id, Integer state) {
		return clientmapper.modifyClientState(id, state);
	}

	/**
	 * 根据id查找客户
	 * 
	 * @param id
	 * @return
	 */
	public Client findClientById(Integer id) {
		return clientmapper.findClientById(id);
	}

	/**
	 * 查询所有客户
	 * 
	 * @return
	 */
	public List<Client> findClients() {
		return clientmapper.findClients();
	}

	/**
	 * 根据条件查找客户
	 * 
	 * @param client
	 * @return
	 */
	public List<Client> findClientsByCondition(Client client) {
		return clientmapper.findClientsByCondition(client);
	}
}
