package com.rewardpoint.api.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rewardpoint.api.model.Responcedata;
import com.rewardpoint.api.model.RewardpointBO;
import com.rewardpoint.api.service.RewardService;



@RestController
public class rewardController {
	
	
	@Autowired
	private RewardService rewardService;
	
	private static final Logger log = LoggerFactory.getLogger(rewardController.class);
	
	 @RequestMapping(value = "/")
	   public String index() {
	      return "index";
	   }

	 
	 @GetMapping(value = "/getAllTransaction")
public ResponseEntity<?> getAllrewaredDetails() throws IOException {

		 Responcedata result = rewardService.getRewaredTransaction();
	return new ResponseEntity<>(result, HttpStatus.OK);
	
	
}
	 
	 
	 
	 
}
