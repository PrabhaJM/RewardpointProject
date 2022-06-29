package com.rewardpoint.api.model;


public class RewardTotal{
	
	private Integer CustomerID;
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
	
	private String customerName;
	public Integer getTotalReward() {
		return totalReward;
	}
	public void setTotalReward(Integer totalReward) {
		this.totalReward = totalReward;
	}

	private Integer totalReward;

}
