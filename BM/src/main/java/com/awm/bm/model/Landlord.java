package com.awm.bm.model;
/**
 * 房东
 * @author Administrator
 *
 */
public class Landlord {
/**
 * 房东ID 
 */
	private int id;
	/**
	 * 房东名字
	 */
	private String name;
	/**
	 * 房东电话
	 */
	private int phone;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
