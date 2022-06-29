package com.rewardpoint.api.model;

import java.util.List;

import lombok.Data;


@Data
public class RewardpointBO {
	
	private Integer customerID;
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	private String customerName;
	private Integer amount;
	private String transactionDate;
	private Integer TotalReward;
	
	public Integer getTotalReward() {
		return TotalReward;
	}
	public void setTotalReward(Integer totalReward) {
		TotalReward = totalReward;
	}
	

}
