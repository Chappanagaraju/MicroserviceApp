package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@Value("${server.port}")
	private int port;

	@GetMapping("/cust")
	public String provideMsg(){
		return "FROM CUSTOMER:"+port;
	}
}