package com.duo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${server.port}")
	private String port;
	
	@Value("${name}")
	private String name;
	
	@RequestMapping("/port")
	public String findPort(){
		return this.port+this.name;
	}
}
