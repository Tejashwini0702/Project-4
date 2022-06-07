package com.abstraction;

public class Organization {
	//private int id;
		int id;
		
		//private String name;
		String name;
		
		public Organization() 
		{	
			id = 4584;
			name = "capgemini";
		}
		
		public void getOrgInformation()
		{
			System.out.println(id);
			System.out.println(name);
		}

}
