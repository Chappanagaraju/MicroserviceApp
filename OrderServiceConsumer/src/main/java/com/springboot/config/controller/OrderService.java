package com.springboot.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderService {
@Value("${my.app:Hello default One")	
private String port;
@GetMapping("/status")
public String getOrderStatus()
{
	return "FINISHED::"+port;
}
}
