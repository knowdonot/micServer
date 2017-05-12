package com.duo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ComputeController {

	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/add")
	public Integer add(@RequestParam Integer a,@RequestParam Integer b){
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("/add,host:"+instance.getHost()+",port:"+instance.getPort()+",server_id:"+instance.getServiceId());
		Integer r = a + b;
		return r;
	}

}
