package com.prabhakar.springdemo.serviceImpl;

import java.util.Random;

import com.prabhakar.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService{

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n As an organisation"+ companyName+ "provides world class cloud computing services."+ 						"The annual income exceeds"+random.nextInt(revenue)+ "dollers";
		
		return service;
	}
	

}
