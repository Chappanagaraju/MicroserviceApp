package com.springboot.account.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

public class Account {
	@Id
private String name;
private Date lastSeen;
@Valid
private List<Item> income;
@Valid
private List<Item> expense;
@NotNull
@Valid
private Saveing saveing;
@Length(min=0, max=20_000)
private String note;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getLastSeen() {
	return lastSeen;
}
public void setLastSeen(Date lastSeen) {
	this.lastSeen = lastSeen;
}
public List<Item> getIncome() {
	return income;
}
public void setIncome(List<Item> income) {
	this.income = income;
}
public List<Item> getExpense() {
	return expense;
}
public void setExpense(List<Item> expense) {
	this.expense = expense;
}
public Saveing getSaveing() {
	return saveing;
}
public void setSaveing(Saveing saveing) {
	this.saveing = saveing;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}


}
