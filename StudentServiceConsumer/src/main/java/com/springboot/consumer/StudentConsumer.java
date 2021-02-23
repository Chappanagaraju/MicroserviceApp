package com.springboot.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentConsumer {
@Autowired	
private DiscoveryClient client;
@GetMapping("/consume")
public String ConsumeData()
{
	RestTemplate tmp=new RestTemplate();
	List<ServiceInstance> list=client.getInstances("STUDENT_PROVIDER");
	ResponseEntity<String> resp=tmp.getForEntity(list.get(0).getUri()+"/show", String.class);
	return "FORM CONSUMER=>"+resp.getBody();
}
}
