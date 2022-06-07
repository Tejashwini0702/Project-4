package com.methodOverloading;
public class Employee {
	//variables(state)
		int id;
		String name;
		double salary;	
		static String deptName;
		//constructors
		public Employee() 
		{
			id = 6449;
			name = "Teju";
			salary = 25486.45;
		}
		//blocks
		static
		{
			deptName = "Development";
		}	
		//method without parameters
		public void getInformation()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(deptName);
		}
		
		//method with parameters
		public void getInformation(int id, String name, double salary)
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
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
			System.out.println("===================");			
			employee.getInformation(1456, "ABC", 12548.34);
		}	
}
