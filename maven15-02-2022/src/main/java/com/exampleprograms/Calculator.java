package com.exampleprograms;
import java.util.Scanner;
public class Calculator {
	static int num1, num2, sum, sub, product, division, mode;
    static Scanner scanner = new Scanner(System.in);
    public static void Addition()    {
        System.out.println("Enter first value:");
        num1 = scanner.nextInt();
        System.out.println( "Enter second value:");
        num2 = scanner.nextInt();       
        sum=num1+num2;
        System.out.println("sum :"+sum);
        System.out.println();
    }
    public static void substraction()  {
        System.out.println("Enter first value:");
        num1 = scanner.nextInt();
        System.out.println( "Enter second value:");
        num2 = scanner.nextInt();       
        sub=num1-num2;
        System.out.println("sub :"+sub);
        System.out.println();
    } 
    public static void product()  {
        System.out.println("Enter first value:");
        num1 = scanner.nextInt();
        System.out.println( "Enter second value:");
        num2 = scanner.nextInt();       
        product=num1*num2;
        System.out.println("product :"+product);
        System.out.println();
    }
    public static void division()
    {
        System.out.println("Enter first value:");
        num1 = scanner.nextInt();
        System.out.println( "Enter second value:");
        num2 = scanner.nextInt();       
        division=num1/num2;
        System.out.println("division :"+division);
        System.out.println();
    }
    public static void mode()
    {
        System.out.println("Enter first value:");
        num1 = scanner.nextInt();
        System.out.println( "Enter second value:");
        num2 = scanner.nextInt();       
        mode=num1%num2;
        System.out.println("mode :"+mode);
        System.out.println();
    }
    public static void main(String [] args) {
    	while(true) {
    		System.out.println("=====OPERATION MENU=====");
    		System.out.println("1. Addition");
    		System.out.println("2. substraction");
    		System.out.println("3. product");
    		System.out.println("4. division");
    		System.out.println("5. mode");
    		System.out.println("6. Stop");
    		
    		System.out.println("Select your operation : ");
    		int operation = scanner.nextInt();

			switch(operation)
			{

			case 1:
				Addition();
				break;

			case 2:
				substraction();
				break;

			case 3:
				product();
				break;

			case 4:
				division();
				break;

			case 5:
				mode();
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Select Valid Operation....!");
}  } }}
