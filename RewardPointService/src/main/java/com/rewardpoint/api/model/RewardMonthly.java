package com.rewardpoint.api.model;

public class RewardMonthly {

	
	public Integer getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(Integer customerID) {
		CustomerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	
	private Integer CustomerID;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getRewardpoint() {
		return rewardpoint;
	}
	public void setRewardpoint(Integer rewardpoint) {
		this.rewardpoint = rewardpoint;
	}

	private String customerName;
	private String Month;
	private Integer amount;
	private Integer rewardpoint;

}
