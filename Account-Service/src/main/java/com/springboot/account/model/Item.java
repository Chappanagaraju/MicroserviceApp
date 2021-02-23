package com.springboot.account.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Item {
@NotNull
@Length(min=1, max=15)
private String title;
@NotNull
private BigDecimal amount;
@NotNull
private currency currency;
@NotNull
private TimePeriod period;
@NotNull
private String icon;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
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
public TimePeriod getPeriod() {
	return period;
}
public void setPeriod(TimePeriod period) {
	this.period = period;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}

}
