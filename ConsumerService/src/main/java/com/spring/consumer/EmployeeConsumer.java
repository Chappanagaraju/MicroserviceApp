package com.spring.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class EmployeeConsumer {
	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/consume")
	public String readProducerInfo() {
		String URL="";
		RestTemplate rt=new RestTemplate();
		
		//Get All ServiceInstaces based on Application Id
		List<ServiceInstance> siList=client.getInstances("EMPLOYEE-PRODUCER");
		ServiceInstance si=siList.get(0);//only one Instance is there
		
		//URI = Protocol://IP:PORT  , Path:/show
		URL=si.getUri()+"/show";
		
		//make HTTP call
		String resp=rt.getForObject(URL, String.class);
		
		return "FROM CONSUMER=>"+resp;
  }
}
