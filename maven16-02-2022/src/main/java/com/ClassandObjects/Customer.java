package com.ClassandObjects;
public class Customer {
		//state(variables/Fields)
		int customerId = 4567;
		String customerName = "Raju";
		String customerAddress = "Hyderabad";	
		//behavior(methods)
		public void getcustomerDetails(){
			System.out.println(customerId);
			System.out.println(customerName);
			System.out.println(customerAddress);
		}
    public static void main( String[] args )
    {
        Customer customer1 = new Customer();		
		Customer customer2 = new Customer();
		/*
		 * System.out.println(customer1.hashCode());
		 * System.out.println(customer2.hashCode());
		 */		
		customer1.getcustomerDetails();
		System.out.println("==============");
		customer2.getcustomerDetails();
    }	
}

		
	
       
