package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.awm.bm.model.Landlord;
import com.awm.bm.persistence.Provider.LandlordProvider;

@Mapper
public interface LandlordMapper {
	/**
	 * 添加房东
	 * 
	 * @param landlord
	 * @return
	 */
	@Insert("insert into landlord values(#{landlord})")
	public int addLandlord(@Param("landlord") Landlord landlord);
	/**
	 * 修改房东信息
	 * @param landlord
	 * @return
	 */
	@UpdateProvider(type=LandlordProvider.class,method="modifyLandlord")
	public int modifyLandlord(@Param("landlord")Landlord landlord);
	/**
	 * 通过id查询房东
	 * @param id
	 * @return
	 */
	@Select("select * from landlord where id=#{id}")
	public Landlord findLandlordById(@Param("id")Integer id);
	/**
	 * 查询所有房东
	 * @return
	 */
	@Select("select * from landlord")
	public List<Landlord> findLandlords();
}
