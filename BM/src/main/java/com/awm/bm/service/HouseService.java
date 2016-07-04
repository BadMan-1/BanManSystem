package com.awm.bm.service;

import java.util.List;

import com.awm.bm.model.Availability;
import com.awm.bm.model.Landlord;
import com.awm.bm.persistence.AvailabilityMapper;
import com.awm.bm.persistence.LandlordMapper;

public class HouseService {
	private AvailabilityMapper availabilitymapper;
	private LandlordMapper landlordmapper;

	/**
	 * ��ӷ�Դ
	 * 
	 * @param availability
	 * @return
	 */
	public int addAvailability(Availability availability) {
		return availabilitymapper.addAvailability(availability);
	}

	/**
	 * �޸ķ�Դ��Ϣ
	 * 
	 * @param id
	 * @param availability
	 * @return
	 */
	public int modifyAvailability(Availability availability) {
		return availabilitymapper.modifyAvailability(availability);
	}

	/**
	 * �޸ķ�Դ״̬
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	public int modifyAvailabilityState(Integer id, Integer state) {
		return availabilitymapper.modifyAvailabilityState(id, state);
	}
	
	/**
	 * ͨ��id���ҷ�Դ
	 * 
	 * @param id
	 * @return
	 */
	public Availability findAvailabilityById(Integer id) {
		return availabilitymapper.findAvailabilityById(id);
	}

	/**
	 * ��ʾ���з�Դ
	 * 
	 * @return
	 */
	public List<Availability> findAvailability() {
		return availabilitymapper.findAvailability();
	}

	/**
	 * ������������Դ
	 * 
	 * @param availability
	 * @return
	 */
	public List<Availability> findAvailabilityByCondition(Availability availability) {
		return availabilitymapper.findAvailabilityByCondition(availability);
	}
	
	/**
	 * ��ӷ���
	 * 
	 * @param landlord
	 * @return
	 */
	public int addLandlord(Landlord landlord){
		return landlordmapper.addLandlord(landlord);
	}
	/**
	 * ͨ��id��ѯ����
	 * @param id
	 * @return
	 */
	public Landlord findLandlordById(Integer id){
		return landlordmapper.findLandlordById(id);
	}
	
	/**
	 * ��ѯ���з���
	 * @return
	 */
	public List<Landlord> findLandlords(){
		return landlordmapper.findLandlords();
	}
}
