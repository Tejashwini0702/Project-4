package com.superkeyword;
public class Employee extends Organization
{	
	//variables(state)
	int id;
	String name;
	double salary;	
	static String deptName;
	//constructors
	public Employee() 
	{
		id = 4875;
		name = "Teju";
		salary = 22485.45;
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
		System.out.println(super.id);
		System.out.println(super.name);
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
