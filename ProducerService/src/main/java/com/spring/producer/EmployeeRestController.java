package com.spring.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
@GetMapping("/show")
public String ShowMsg()
{
	return "FROM PRODUCER";
}
}
