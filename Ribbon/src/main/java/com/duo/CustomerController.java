package com.duo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.duo.service.ComputeService;

@RestController
public class CustomerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ComputeService computeService;
	
	
	@RequestMapping("/add")
	public String add(){
		return computeService.addService();
	}

}
