package com.springboot.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/contract")
public class ContractRestController {
	@Autowired
 private VenderRestConsumer consumer;
	@GetMapping("/info")
	public String viewContractData()
	{
		return "FROM CONTRAT=>"+consumer.getVederDte();
	}
}
