package com.spring.security.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProducerApplication.class, args);
	}

}
