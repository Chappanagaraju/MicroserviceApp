package com.springboot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VenderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenderServiceApplication.class, args);
	}

}
