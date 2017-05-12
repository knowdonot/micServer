package com.duo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出该注解能激活
//                       Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
//		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
