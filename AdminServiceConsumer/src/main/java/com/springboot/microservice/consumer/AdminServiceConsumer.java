package com.springboot.microservice.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdminServiceConsumer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> resp=rt.getForEntity("http://localhost:8080/provider/show", String.class);
		System.out.println(resp.getBody());
		System.exit(0);
	}

}
