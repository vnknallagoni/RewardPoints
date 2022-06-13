package com.bank.bankrewardspoints.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankrewardspoints.service.BankRewardsPointsService;

@RestController
public class BankRewardsPointsController {
	
	
	@Autowired
	BankRewardsPointsService  bankRewardsPointsService;
	
	@GetMapping(value = "/getRewards")
	public ResponseEntity<Integer> getBankRewards(double amountPurchased) {
		
		int rewardspoints=bankRewardsPointsService.calculateRewards(amountPurchased);
		return new ResponseEntity<>(rewardspoints, HttpStatus.OK);
	}
	
}
