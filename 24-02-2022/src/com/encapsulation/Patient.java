package com.encapsulation;
public class Patient {
	int Id;
	String Name;
	double Bill;	
	String Address;
	static String Consultdoctor;
	//constructors
	public Patient() {
		Id = 5846;
		Name = "krishna";
		Bill = 90458.59;
		Address = "Hyderabad";
	}
	//blocks
	static{
		Consultdoctor = "Srinidhi";
		}		
	//methods(behavior)
	public void getInformation(){
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(Bill);
		System.out.println(Address);
		System.out.println(Consultdoctor);
	}	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Patient Patient = new Patient();
		Patient.getInformation();
	}	
}
