package com.duo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	ComputeClient computeClient;
	
	@RequestMapping("/add")
	public Integer add(){
		return computeClient.add(10, 20);
	}

}
