package com.rewardpoint.api.model;

import java.util.List;

public class TotalRewardpoint {
	
	public Integer getMonthlytotalreward() {
		return Monthlytotalreward;
	}

	public void setMonthlytotalreward(Integer monthlytotalreward) {
		Monthlytotalreward = monthlytotalreward;
	}

	private Integer Monthlytotalreward;
	
	public List<RewardMonthly> getMonthlytransaction() {
		return monthlytransaction;
	}

	public void setMonthlytransaction(List<RewardMonthly> monthlytransaction) {
		this.monthlytransaction = monthlytransaction;
	}

	private List<RewardMonthly> monthlytransaction;

}
