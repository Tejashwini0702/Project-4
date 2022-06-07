package com.coVariantReturnTypes;
public class Employee extends Organization
{	
	//variables(state)
	double salary;	
	static String deptName;
	//constructors
	public Employee() 
	{
		id =4587 ;
		name = "Teju";
		salary = 24585.45;
	}
	//blocks
	static
	{
		deptName = "Development";
	}	
	//methods(behavior)
	public Employee getInformation()//overrides com.polymorphism.Organization.getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		
		return null;
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
