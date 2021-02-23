package com.springboot.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="VENDER-SERVICE")
public interface VenderRestConsumer {
@GetMapping("/vender/")
public String getVederDte();
}
