package methods;
import java.util.Scanner;
public class Example4 {
	public static void main(String[] args){
		int A, B, sum, sub, product, division, mode;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter First Value: ");
		A = Scanner.nextInt();
		System.out.println("Enter Second Value: ");
		B = Scanner.nextInt();
		//Sum of two numbers
		sum = A+B;
		System.out.println("Sum: "+sum);
		System.out.println("====================");
		//Subtraction of two numbers
		sub = A-B;
		System.out.println("Sub: "+sub);
		System.out.println("====================");
		//Product of two numbers
		product = A*B;
		System.out.println("Product: "+product);	
		System.out.println("====================");
		//Division of two numbers
		division = A/B;
		System.out.println("Division: "+division);	
		System.out.println("====================");
		mode = A%B;
		System.out.println("Mode: "+mode);
		Scanner.close();
	}
}
