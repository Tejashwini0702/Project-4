package com.objectcloning;
public class Employee implements Cloneable{
    int Id;
    String Name;
    double Salary;
    String Address;  
    public Employee() {
    	Id=6449;
    	Name="Ajay";
    	Salary=85486.25;
    	Address="Hyderabad";
    	 }
    public void getEmployeeInfo() {
    	System.out.println(Id);
    	System.out.println(Name);
    	System.out.println(Salary);
    	System.out.println(Address);
    }
	public static void main(String[] args) throws  CloneNotSupportedException
	{
     System.out.println("-----------using new keyword------------");
     Employee Employee2=new Employee();
     Employee2.getEmployeeInfo();
     System.out.println("-----------using clone() method------------");	
		Employee Employee3=(Employee) Employee2.clone();
		Employee3.getEmployeeInfo();
	}
}
