package com.springboot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeedBackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedBackServiceApplication.class, args);
	}

}
