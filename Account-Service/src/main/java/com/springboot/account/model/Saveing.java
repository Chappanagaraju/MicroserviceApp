package com.springboot.account.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class Saveing {
	@NotNull
   private BigDecimal amount;
	@NotNull
	private currency currency;
	@NotNull
	private BigDecimal Interest;
	@NotNull
	private Boolean deposit;
	@NotNull
	private Boolean capitalization;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public currency getCurrency() {
		return currency;
	}
	public void setCurrency(currency currency) {
		this.currency = currency;
	}
	public BigDecimal getInterest() {
		return Interest;
	}
	public void setInterest(BigDecimal interest) {
		Interest = interest;
	}
	public Boolean getDeposit() {
		return deposit;
	}
	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}
	public Boolean getCapitalization() {
		return capitalization;
	}
	public void setCapitalization(Boolean capitalization) {
		this.capitalization = capitalization;
	}
	
}
