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
	 * ��ӷ���
	 * 
	 * @param landlord
	 * @return
	 */
	@Insert("insert into landlord values(#{landlord})")
	public int addLandlord(@Param("landlord") Landlord landlord);
	/**
	 * �޸ķ�����Ϣ
	 * @param landlord
	 * @return
	 */
	@UpdateProvider(type=LandlordProvider.class,method="modifyLandlord")
	public int modifyLandlord(@Param("landlord")Landlord landlord);
	/**
	 * ͨ��id��ѯ����
	 * @param id
	 * @return
	 */
	@Select("select * from landlord where id=#{id}")
	public Landlord findLandlordById(@Param("id")Integer id);
	/**
	 * ��ѯ���з���
	 * @return
	 */
	@Select("select * from landlord")
	public List<Landlord> findLandlords();
}
