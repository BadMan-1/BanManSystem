package com.awm.bm.service;

import java.util.List;


import com.awm.bm.model.Client;
import com.awm.bm.persistence.ClientMapper;

public class OrderService {
	private ClientMapper clientmapper;

	/**
	 * ���ӿͻ�
	 * 
	 * @param client
	 * @return
	 */
	public int addClient(Client client) {
		return clientmapper.addClient(client);
	}

	/**
	 * �޸Ŀͻ���Ϣ
	 * 
	 * @param client
	 * @return
	 */
	public int modifyClient(Client client) {
		return clientmapper.modifyClient(client);
	}

	/**
	 * �޸Ŀͻ�״̬
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	public int modifyClientState(Integer id, Integer state) {
		return clientmapper.modifyClientState(id, state);
	}

	/**
	 * ����id���ҿͻ�
	 * 
	 * @param id
	 * @return
	 */
	public Client findClientById(Integer id) {
		return clientmapper.findClientById(id);
	}

	/**
	 * ��ѯ���пͻ�
	 * 
	 * @return
	 */
	public List<Client> findClients() {
		return clientmapper.findClients();
	}

	/**
	 * �����������ҿͻ�
	 * 
	 * @param client
	 * @return
	 */
	public List<Client> findClientsByCondition(Client client) {
		return clientmapper.findClientsByCondition(client);
	}
}