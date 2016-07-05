package com.awm.bm.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.awm.bm.model.Contract;

@Mapper
public interface ContractMapper {
	/**
	 * 添加订单
	 * 
	 * @param contract
	 * @return
	 */
	@Insert("insert into contract values(#{contract})")
	public int addContract(@Param("contract") Contract contract);

	/**
	 * 修改订单
	 * 
	 * @param contract
	 * @return
	 */
	public int modifyContract(Contract contract);

	/**
	 * 根据id查询订单
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from contract where id=#{id}")
	public Contract findContractById(@Param("id") Integer id);

	/**
	 * 显示所有订单
	 * 
	 * @return
	 */
	@Select("select * from contract")
	public List<Contract> frindContracts();

}
