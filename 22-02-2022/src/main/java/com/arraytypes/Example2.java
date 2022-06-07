package com.arraytypes;

public class Example2 {

	public static void main(String[] args) 
	{
				int employeeIds[] = new int[5];//array object creation
				
				//array initialization
				employeeIds[0] = 5829; 
				employeeIds[1] = 5462; 
				employeeIds[2] = 7952;
				employeeIds[3] = 1205; 
				employeeIds[4] = 7920;	 
						
				for(int id: employeeIds)
				{
					System.out.println(id);
				}		
	}
}
