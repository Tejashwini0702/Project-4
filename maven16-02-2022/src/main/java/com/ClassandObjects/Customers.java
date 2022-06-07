package com.ClassandObjects;

public class Customers {
	int customerId;
	String customerName;
	String customerAddress;
	public Customers(int customerId1, String customerName1, String customerAddress1) {
		customerId = customerId1;
		customerName = customerName1;
		customerAddress = customerAddress1;
	}
	//behavior(methods)
	public void getcustomerDetails(){
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
	}
	public static void main(String[] args){	
		Customers customer1 = new Customers(9603, "Teja", "Banglore");		
		Customers customer2 = new Customers(6302, "Raju", "Hyderabad");		
		Customers customer3 = new Customers(8189, "Ajay", "chennai");		
		customer1.getcustomerDetails();
		System.out.println("====================");
		customer2.getcustomerDetails();
		System.out.println("====================");
		customer3.getcustomerDetails();
}}
