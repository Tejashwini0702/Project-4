package com.finalkeyword;
public class Employee extends Organization
{
	int id;
	String name;
	double salary;
	static String deptName;
	//constructors
	public Employee() 
	{
		id = 3856;
		name = "Teju";
		salary = 25484.45;
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
		organization.getInformation();
	}	
}
