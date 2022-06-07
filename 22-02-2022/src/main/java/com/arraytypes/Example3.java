package com.arraytypes;

public class Example3 {

	public static void main(String[] args)
	{
       int matrix[][] = {{5258, 4552}, {1246, 9278}};
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
	}
}
