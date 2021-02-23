package com.springboot.Feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootFeignLsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignLsbApplication.class, args);
	}

}
