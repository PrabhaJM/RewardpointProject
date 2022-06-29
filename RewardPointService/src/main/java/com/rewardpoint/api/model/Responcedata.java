package com.rewardpoint.api.model;

import java.util.List;

public class Responcedata {
	
	
	private List<RewardpointBO> transactionResponse;
	private  List<RewardTotal> TotalRewardResponse;

	
	public TotalRewardpoint getMonthlyTransactionResponse() {
		return MonthlyTransactionResponse;
	}
	public void setMonthlyTransactionResponse(TotalRewardpoint monthlyTransactionResponse) {
		MonthlyTransactionResponse = monthlyTransactionResponse;
	}
	private  TotalRewardpoint MonthlyTransactionResponse;
	
	
	public List<RewardTotal> getTotalRewardResponse() {
		return TotalRewardResponse;
	}
	public void setTotalRewardResponse(List<RewardTotal> totalRewardResponse) {
		TotalRewardResponse = totalRewardResponse;
	}
	public List<RewardpointBO> getTransactionResponse() {
		return transactionResponse;
	}
	public void setTransactionResponse(List<RewardpointBO> rewardlist) {
		this.transactionResponse = rewardlist;
	}
	

}
