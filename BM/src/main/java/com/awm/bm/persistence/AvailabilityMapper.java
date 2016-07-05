package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.awm.bm.model.Availability;
import com.awm.bm.persistence.Provider.AvailabilityProvider;

@Mapper
public interface AvailabilityMapper {
	/**
	 * ��ӷ�Դ
	 * 
	 * @param availability
	 * @return
	 */
	@Insert("insert into availability values(id,#{availability.landlord}),#{availability.salesman}),#{availability.store}),#{availability.city_area}),#{availability.plot}),#{availability.adress}),#{availability.floor}),#{availability.house_type}),#{availability.acreage}),#{availability.fitment}),#{availability.price}),#{availability.facility}),#{availability.state}),#{availability.time}),#{availability.remark})")
	public int addAvailability(@Param("availability") Availability availability);

	/**
	 * �޸ķ�Դ��Ϣ
	 * 
	 * @param id
	 * @param availability
	 * @return
	 */
	@UpdateProvider(type = AvailabilityProvider.class, method = "modifyAvailability")
	public int modifyAvailability(@Param("availability") Availability availability);

	/**
	 * ͨ��id���ҷ�Դ
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from availability where id=#{id}")
	public Availability findAvailabilityById(@Param("id") Integer id);

	/**
	 * ��ʾ���з�Դ
	 * 
	 * @return
	 */
	@Select("select * from availability")
	public List<Availability> findAvailability();

	/**
	 * ������������Դ
	 * 
	 * @param availability
	 * @return
	 */
	@SelectProvider(type = AvailabilityProvider.class, method = "findAvailabilityByCondition")
	public List<Availability> findAvailabilityByCondition(@Param("availability") Availability availability);

}
