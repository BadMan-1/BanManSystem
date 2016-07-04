package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
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
	 * 添加房源
	 * 
	 * @param availability
	 * @return
	 */
	@InsertProvider(type = AvailabilityProvider.class, method = "addAvailability")
	public int addAvailability(@Param("availability") Availability availability);

	/**
	 * 修改房源信息
	 * 
	 * @param id
	 * @param availability
	 * @return
	 */
	@UpdateProvider(type = AvailabilityProvider.class, method = "modifyAvailability")
	public int modifyAvailability(@Param("availability") Availability availability);

	/**
	 * 修改房源状态
	 * 
	 * @param id
	 * @param state
	 * @return
	 */
	@Update("update availability set state=#{state} where id=#{id}")
	public int modifyAvailabilityState(@Param("id") Integer id, @Param("state") Integer state);

	/**
	 * 通过id查找房源
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from availability where id=#{id}")
	public Availability findAvailabilityById(@Param("id") Integer id);

	/**
	 * 显示所有房源
	 * 
	 * @return
	 */
	@Select("select * from availability")
	public List<Availability> findAvailability();

	/**
	 * 按条件搜索房源
	 * 
	 * @param availability
	 * @return
	 */
	@SelectProvider(type = AvailabilityProvider.class, method = "findAvailabilityByCondition")
	public List<Availability> findAvailabilityByCondition(@Param("availability") Availability availability);

}
