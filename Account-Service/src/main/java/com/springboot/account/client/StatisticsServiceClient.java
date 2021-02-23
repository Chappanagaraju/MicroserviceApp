package com.springboot.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.account.model.Account;

@FeignClient(name= "ststisticsServiceClient")
public interface StatisticsServiceClient {
	@RequestMapping(method= RequestMethod.PUT, value="/ststistics/{accountName}",consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
void updateStatics(@PathVariable("accountName") String accountName, Account account);
}
