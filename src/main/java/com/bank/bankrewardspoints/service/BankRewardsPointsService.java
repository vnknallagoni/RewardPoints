package com.bank.bankrewardspoints.service;

import org.springframework.stereotype.Service;

@Service
public class BankRewardsPointsService {

	
	public int calculateRewards(double amountPurchased) {
		int rewardPoints=0;
		int hundred=100;
		int fifty =50;
		if(amountPurchased > hundred) {			
			rewardPoints = (int)(((amountPurchased - hundred)*2)+fifty);
						
		}else if( amountPurchased<hundred && amountPurchased >fifty){
			rewardPoints = (int) (rewardPoints - fifty);
			
		}
		System.out.println("rewardPoints ---  "+rewardPoints);
		return rewardPoints;
	}
	
	

}
