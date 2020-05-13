package com.example.demo.hystrix;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.fegin.HelloRemoteService;

@Service
public class HelloRemoteServiceHystrix implements HelloRemoteService{

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello " +name+", this messge send failed ";
	}
	
}
