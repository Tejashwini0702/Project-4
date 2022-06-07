package com.coVariantReturnTypes;

public class Organization {
	int id;
	String name;
	
	public Organization() 
	{	
		id = 6449;
		name = "Capgemini";
	}
	
	public Organization getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
		return null;
	}

}
