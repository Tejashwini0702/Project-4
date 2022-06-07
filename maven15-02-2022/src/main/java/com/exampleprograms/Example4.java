package com.exampleprograms;
import java.util.Scanner;
public class Example4 {
	// java program to calculate sum of two numbers using methods
		public static int getSum(int A, int B){
			return A+B;
		}
		public static void main(String[] args) {			
			Scanner scanner = new Scanner(System.in);		
			System.out.println("Enter First Value: ");
			int A = scanner.nextInt();		
			System.out.println("Enter Second Value: ");
			int B = scanner.nextInt();			
			//calling method
			int sum = getSum(A,B);				
			System.out.println("Sum: "+sum);		
			scanner.close();
}}
