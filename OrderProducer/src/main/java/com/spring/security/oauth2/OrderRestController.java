package com.spring.security.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
	@GetMapping("/order")
	public String showOrderInfo()
	{
		return "FORM_ORDER";
	}
}
