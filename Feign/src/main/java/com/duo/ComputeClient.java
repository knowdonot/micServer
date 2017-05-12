package com.duo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="computer-service",fallback = ComputeClientHystrix.class) //注解来绑定该接口对应compute-service服务
public interface ComputeClient {

	@RequestMapping("/add")
	Integer add(@RequestParam(value="a") Integer a,@RequestParam(value="b") Integer b);
	
}
