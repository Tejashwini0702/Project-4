package com.ClassandObjects;
public class Employee {
	int employeeId = 3039;
	String employeeName = "Teju Reddy";
	double employeeSalary = 7013.45;
	String employeeAddress = "Hyderabad";
	//behavior(methods)
	public void getEmployeeDetails(){
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeSalary);
		System.out.println(employeeAddress);
	}
	public static void main(String[] args){
	Employee employee1 = new Employee();	
		
		//System.out.println(employee1.hashCode());
		employee1.getEmployeeDetails();
}}
