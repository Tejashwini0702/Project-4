package com.finalkeyword;
public class Organization {
	int id;
	String name;
	
	public Organization() 
	{	
		id = 6449;//The final field Organization.id cannot be reassigned
		name = "Capgemini";
	}
	
	//2. final keyword with method
	//public final void getInformation()
	//Cannot override the final method to sub class	
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
}
