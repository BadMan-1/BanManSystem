package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.awm.bm.model.Store;
import com.awm.bm.persistence.Provider.StoreProvider;

@Mapper
public interface StoreMapper {
	
	/**
	 * 添加店铺
	 * @param store
	 * @return
	 */
	@Insert("insert into store values(#{store})")
	public int addStore(@Param("store")Store store);
	/**
	 * 修改店铺信息
	 * @param store
	 * @return
	 */
	@UpdateProvider(type=StoreProvider.class,method="modifyStore")
	public int modifyStore(@Param("store")Store store);
	/**
	 * 通过id查找店铺
	 * @param id
	 * @return
	 */
	@Select("select * from store")
	public Store findStoreById(@Param("id")Integer id);
	/**
	 * 查询所有店铺
	 * @return
	 */
	@Select("select * from store")
	public List<Store> findStores();
	/**
	 * 根据条件查找店铺
	 * @return
	 */
	@SelectProvider(type=StoreProvider.class,method="findStoresByCondition")
	public List<Store> findStoresByCondition(@Param("store")Store store);
}
