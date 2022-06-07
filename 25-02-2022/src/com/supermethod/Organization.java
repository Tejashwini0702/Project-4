package com.supermethod;
public class Organization {
	int id;
	String name;
	
	//constructor
	public Organization() 
	{	
		id = 6449;
		name = "Capgemini";
		System.out.println("Organization class constructor");
	}
	
	public void getOrgInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}

}
