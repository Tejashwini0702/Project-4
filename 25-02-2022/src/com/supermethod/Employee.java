package com.supermethod;
public class Employee extends Organization
{	
	//variables(state)
	double salary;	
	static String deptName;
	//constructor
	public Employee() 
	{
		super();
		id = 4584;
		name = "Teju";
		salary = 23655.45;
		System.out.println("Employee class constructor");
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
		new Employee();		
	}	
}
