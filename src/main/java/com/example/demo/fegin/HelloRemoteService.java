package com.example.demo.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="demo-producer")
public interface HelloRemoteService {
	
	@RequestMapping(value="/hello")
	public String hello(@RequestParam(value="name") String name);
}
