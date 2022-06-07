package com.encapsulation;
public class Employee {
	//variables(state)
		int Id;
		String Name;
		double Salary;	
		static String deptName;
		//constructors
		public Employee() {
			Id = 6449;
			Name = "Teju";
			Salary = 25468.45;
		}
		//blocks
		static{
			deptName = "Development";
		}		
		//methods(behavior)
		public void getInformation(){
			System.out.println(Id);
			System.out.println(Name);
			System.out.println(Salary);
			System.out.println(deptName);
		}	
		//main
		public static void main(String[] args) 
		{ 
			//objects
			Employee employee = new Employee();
			employee.getInformation();
		}	
}
