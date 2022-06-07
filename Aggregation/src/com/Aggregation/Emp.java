package com.Aggregation;
public class Emp {
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}    
	public void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}    
	public static void main(String[] args) {  
	Address address1=new Address("Hyd","Telangana","India");  
	Address address2=new Address("Wnp","Telangana","India");  
	  
	Emp e1=new Emp(543,"Ajay",address1);  
	Emp e2=new Emp(548,"Teju",address2);  	      
	e1.display();  
	e2.display();  	      
	}  
}
