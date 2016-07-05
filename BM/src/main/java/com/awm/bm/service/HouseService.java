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
	 * 添加房源
	 * 
	 * @param availability
	 * @return
	 */
	public int addAvailability(Availability availability) {
		return availabilitymapper.addAvailability(availability);
	}

	/**
	 * 修改房源信息
	 * 
	 * @param id
	 * @param availability
	 * @return
	 */
	public int modifyAvailability(Availability availability) {
		return availabilitymapper.modifyAvailability(availability);
	}

	/**
	 * 通过id查找房源
	 * 
	 * @param id
	 * @return
	 */
	public Availability findAvailabilityById(Integer id) {
		return availabilitymapper.findAvailabilityById(id);
	}

	/**
	 * 显示所有房源
	 * 
	 * @return
	 */
	public List<Availability> findAvailability() {
		return availabilitymapper.findAvailability();
	}

	/**
	 * 按条件搜索房源
	 * 
	 * @param availability
	 * @return
	 */
	public List<Availability> findAvailabilityByCondition(Availability availability) {
		return availabilitymapper.findAvailabilityByCondition(availability);
	}
	
	/**
	 * 添加房东
	 * 
	 * @param landlord
	 * @return
	 */
	public int addLandlord(Landlord landlord){
		return landlordmapper.addLandlord(landlord);
	}
	/**
	 * 通过id查询房东
	 * @param id
	 * @return
	 */
	public Landlord findLandlordById(Integer id){
		return landlordmapper.findLandlordById(id);
	}
	
	/**
	 * 查询所有房东
	 * @return
	 */
	public List<Landlord> findLandlords(){
		return landlordmapper.findLandlords();
	}
}
