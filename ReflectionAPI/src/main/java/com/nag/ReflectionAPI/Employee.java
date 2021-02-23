package com.nag.ReflectionAPI;

public class Employee implements IModel {
     public Employee()
     {
    	 System.out.println("Employee Constructor");
     }
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Employee";
	}

	@Override
	public IModel getModelObject() {
		// TODO Auto-generated method stub
		return this;
	}
public String toString()
{
	return "From Employee Object";
  
}
}
