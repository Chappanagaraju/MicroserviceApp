package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {
@Autowired
private OrderRestConsumer consumer;
@GetMapping("/consume")
public String fingMsg()
{
	return "CONSUMER=>"+consumer.doHttpCall();
}
}
