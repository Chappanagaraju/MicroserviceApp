package com.springboot.Feign.model;

public class Cart {
	private Integer cartid;
	private String  cartCode;
	private Double cartfinalCost;
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(Integer cartid, String cartCode, Double cartfinalCost) {
	super();
	this.cartid = cartid;
	this.cartCode = cartCode;
	this.cartfinalCost = cartfinalCost;
}
public Integer getCartid() {
	return cartid;
}
public void setCartid(Integer cartid) {
	this.cartid = cartid;
}
public String getCartCode() {
	return cartCode;
}
public void setCartCode(String cartCode) {
	this.cartCode = cartCode;
}
public Double getCartfinalCost() {
	return cartfinalCost;
}
public void setCartfinalCost(Double cartfinalCost) {
	this.cartfinalCost = cartfinalCost;
}
@Override
public String toString() {
	return "Cart [cartid=" + cartid + ", cartCode=" + cartCode + ", cartfinalCost=" + cartfinalCost + "]";
}

}
