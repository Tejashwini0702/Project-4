package com.methodoverriding;
public class Organization {
	int id;
	String name;
	
	public Organization() 
	{	
		id = 4567;
		name = "Capgemini";
	}
	
	public void getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
	}

}
