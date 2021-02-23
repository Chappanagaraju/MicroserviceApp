package com.springboot.account.model;

public enum currency {
  USD, EUR, RUD;
	public static currency getDefault()
	{
		return USD;
	}
}
