package com.association;

public class EmployeeDetails {

	public static void main(String[] args) {
		Bank bank = new Bank("SBI");
        Employee emp = new Employee("Ajay");
        Bank bank1 = new Bank("AXIS");
        Employee emp1 = new Employee("Teju");

        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()+ " is employee of "+ bank.getBankName());
        System.out.println(emp1.getEmployeeName()+ " is employee of "+ bank1.getBankName());
	}

}
