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
	 * ��Ӷ���
	 * 
	 * @param contract
	 * @return
	 */
	@Insert("insert into contract values(#{contract})")
	public int addContract(@Param("contract") Contract contract);

	/**
	 * �޸Ķ���
	 * 
	 * @param contract
	 * @return
	 */
	public int modifyContract(Contract contract);

	/**
	 * ����id��ѯ����
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from contract where id=#{id}")
	public Contract findContractById(@Param("id") Integer id);

	/**
	 * ��ʾ���ж���
	 * 
	 * @return
	 */
	@Select("select * from contract")
	public List<Contract> frindContracts();

}
