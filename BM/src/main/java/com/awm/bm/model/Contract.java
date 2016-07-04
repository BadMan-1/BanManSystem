package com.awm.bm.model;

/**
 * 合同
 * @author Administrator
 *
 */
public class Contract {
/**
 * 合同ID
 */
	private int id;
	/**
	 * 销售员
	 */
	private int salesman;
	/**
	 * 客户
	 */
	private int client;
	/**
	 * 房源
	 */
	private int availability;
	/**
	 * 租期
	 */
	private int tenancy_term;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 时间
	 */
	private String time;
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
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
	 * @return the salesman
	 */
	public int getSalesman() {
		return salesman;
	}
	/**
	 * @param salesman the salesman to set
	 */
	public void setSalesman(int salesman) {
		this.salesman = salesman;
	}
	/**
	 * @return the client
	 */
	public int getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(int client) {
		this.client = client;
	}
	/**
	 * @return the availability
	 */
	public int getAvailability() {
		return availability;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	/**
	 * @return the tenancy_term
	 */
	public int getTenancy_term() {
		return tenancy_term;
	}
	/**
	 * @param tenancy_term the tenancy_term to set
	 */
	public void setTenancy_term(int tenancy_term) {
		this.tenancy_term = tenancy_term;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
