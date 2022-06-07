package com.objectcloning;
public class Student  implements Cloneable {
   int rollno;
   String name;
   int marks;
   String address; 
   public Student() {
	   rollno=6449;
	   name="TEJU";
	   marks=589;
	   address="Hyderabad";
	  }
   public void getStudentInfo() {
	   System.out.println(rollno);
	   System.out.println(name);
	   System.out.println(marks);
	   System.out.println(address);
   }
   public static void main(String[] args) throws CloneNotSupportedException{	
		System.out.println("=========using new keyword=========");	
		Student student2 = new Student();
		student2.getStudentInfo();	
		System.out.println("=========using clone() method=========");				
		Student student3 = (Student) student2.clone();
		student3.getStudentInfo();		
	}
}
