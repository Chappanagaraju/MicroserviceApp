package com.springboot.account.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class User {
	@NotNull
	@Length(min=4,max=15)
private String userName;
	@NotNull
	@Length(min=6, max=20)
private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
