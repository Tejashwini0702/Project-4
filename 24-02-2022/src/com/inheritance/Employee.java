package com.inheritance;
//sub/derived/child class
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
		salary = 25468.45;
	}
	//blocks
	static
	{
		deptName = "Development";
	}	
	//methods(behavior)
	public void getInformation()
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
		organization.getOrgInformation();
	}	
}

