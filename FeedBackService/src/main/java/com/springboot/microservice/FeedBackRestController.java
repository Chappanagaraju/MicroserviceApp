package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class FeedBackRestController {
@Autowired
private CustomerRestConsumer consumer;
@GetMapping("/feed")
public String feedbakMsg()
{   
	return "FROM FEEDBACK=>"+consumer.readMsgFromCust();
}
}
