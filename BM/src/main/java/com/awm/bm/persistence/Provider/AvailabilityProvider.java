package com.awm.bm.persistence.Provider;

import java.util.Map;

import com.awm.bm.model.Availability;

public class AvailabilityProvider {
	public String modifyAvailability(Map<String, Availability> parameters){
		Availability availability = parameters.get("availability");
		String sql = "update availability ";
		return sql;
	}
	public String findAvailabilityByCondition(){
		return null;
	}
}
