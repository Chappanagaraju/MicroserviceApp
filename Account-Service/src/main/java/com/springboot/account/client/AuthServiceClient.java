package com.springboot.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.account.model.User;
@FeignClient("auth-service")
public interface AuthServiceClient {
	@RequestMapping(method= RequestMethod.POST, value="/uaa/user", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
void CreateUser(User user);
}
