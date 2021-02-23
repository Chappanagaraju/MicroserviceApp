package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {
@GetMapping("/test-docker")
public String getDate()
{
 return	" in docker tutorial project of play java";
}
}
