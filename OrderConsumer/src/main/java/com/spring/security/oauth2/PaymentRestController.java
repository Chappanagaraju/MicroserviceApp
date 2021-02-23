package com.spring.security.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class PaymentRestController {
	@Autowired
	private OrderRestConsumer consumer;
	
	@GetMapping("/payment")
	public String showPaymentData() {
		return "FROM PAYMENT=>"+consumer.connectToOrder();
	}
}
