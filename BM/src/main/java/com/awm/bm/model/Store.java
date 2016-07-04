package com.awm.bm.model;
/**
 * 店铺
 * @author Administrator
 *
 */
public class Store {
/**
 * 店铺ID
 */
	private int id;
	/**
	 * 店长
	 */
	private int shop_manager;
	/**
	 * 店名
	 */
	private String name;
	/**
	 * 城区
	 */
	private String city_area;
	/**
	 * 地址
	 */
	private String address;
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
	 * @return the shop_manager
	 */
	public int getShop_manager() {
		return shop_manager;
	}
	/**
	 * @param shop_manager the shop_manager to set
	 */
	public void setShop_manager(int shop_manager) {
		this.shop_manager = shop_manager;
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
	 * @return the city_area
	 */
	public String getCity_area() {
		return city_area;
	}
	/**
	 * @param city_area the city_area to set
	 */
	public void setCity_area(String city_area) {
		this.city_area = city_area;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
