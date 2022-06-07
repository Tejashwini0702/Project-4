package com.methodoverriding;
public class Employee extends Organization
{	
	//variables(state)
	double salary;
	static String deptName;
	//constructors
	public Employee() 
	{
		id = 6449;
		name = "Teju";
		salary = 25486.75;
	}
	//blocks
	static
	{
		deptName = "Development";
	}
	//methods(behavior)
	public void getInformation()//overrides com.polymorphism.Organization.getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();		
		System.out.println("==============");		
		Organization organization = new Organization();
		organization.getInformation();	
	}
}
