package com.springboot.Feign.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Feign.consumer.CartServiceConsumer;
import com.springboot.Feign.model.Cart;

@RestController
@RequestMapping("/payment")
public class PaymentServiceProvider {
@Autowired
private CartServiceConsumer consumer;
@GetMapping("/message")
public String getMsg()
{
	return consumer.getMsg();
}
@GetMapping("/one")
public Cart getOneRow()
{
	return consumer.getObj();
}
@GetMapping("/all")
public List<Cart> getAllRows()
{
	return consumer.getBulk();
}
}
