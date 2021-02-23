package com.springboot.Feign.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.Feign.model.Cart;

@FeignClient(name="CART-PROVIDER")
public interface CartServiceConsumer {
@GetMapping("/cart/info")
public String getMsg();
@GetMapping("/cart/data")
public Cart getObj();
@GetMapping("/cart/list")
public List<Cart> getBulk();
}
