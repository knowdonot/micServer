package com.duo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class RibbonApplication {

	
	//@LoadBalanced注解开启均衡负载能力
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
	
	public static void main(String[] args) {
//		SpringApplication.run(RibbonApplication.class, args);
		new SpringApplicationBuilder(RibbonApplication.class).web(true).run(args);
	}
	
	
	
}
