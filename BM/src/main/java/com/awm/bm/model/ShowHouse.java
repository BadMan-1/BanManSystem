package com.awm.bm.model;
/**
 * 看房记录
 * @author Administrator
 *
 */
public class ShowHouse {
/**
 * 看房ID
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
	 * 时间
	 */
	private String time;
	/**
	 * 看房结果
	 */
	private String result;
	/**
	 * 备注
	 */
	private String remark;
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
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
