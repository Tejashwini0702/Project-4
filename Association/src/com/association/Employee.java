package com.association;
public class Employee {
	// Attribures of employee
    private String name;
    // Employee name
    public Employee(String name)
    {
        // This keyword refwrs to current insytance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}
