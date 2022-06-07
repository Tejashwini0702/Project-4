package com.arraytypes;

public class Example4 {

	public static void main(String[] args) 
	{
		int matrix[][] = {{525, 455}, {124, 927}};
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");			
			}
			
			System.out.println("\n\n\n");
		}	
		
	}
}
