package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
@Value("${my.application.name}")
 private String data;
@GetMapping("/customer")
public String show()
{
	return "FORM CUSTOMER=>"+data;
}
}
