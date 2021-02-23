package com.springboot.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class StudentProvider {
@GetMapping("show")	
public String showMsg()
{
	return "Student Service from provider";
}
}
