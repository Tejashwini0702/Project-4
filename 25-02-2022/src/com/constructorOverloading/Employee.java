package com.constructorOverloading;
public class Employee {
	//variables(state)
		int id;
		String name;
		double salary;	
		static String deptName;
		//constructor without parameters
		public Employee() 
		{
			id = 1245;
			name = "Teju";
			salary = 25485.45;
		}		
		//constructor with parameters
		public Employee(int id, String name, double salary) 
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
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
		//main
		public static void main(String[] args) 
		{ 
			//objects
			Employee employee1 = new Employee();
			employee1.getInformation();			
			System.out.println("===================");			
			Employee employee2 = new Employee(4545, "Raju", 12485.34);
			employee2.getInformation();
		}	
}
