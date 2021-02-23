package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerRestConsumer {
     @Autowired
	private LoadBalancerClient client;
     public String readMsgFromCust() {
    	 ServiceInstance si=client.choose("CUSTOMER-SERVICE");
    	 String uri=si.getUri()+"/cust";
    	 RestTemplate rt=new RestTemplate();
    	 String res=rt.getForObject(uri, String.class);
    	 return res;
     }
}
