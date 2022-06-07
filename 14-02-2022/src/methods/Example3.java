package methods;
import java.util.Scanner;

public class Example3 {
	//Scanner: by using this class object we can read the data from keyboard(external device).
		public static void main(String[] args)
		{
			
			Scanner Scanner = new Scanner(System.in);
			
			int A, B, sum;
			
			System.out.println("Enter First Value: ");
			A = Scanner.nextInt();
			
			System.out.println("Enter Second Value: ");
			B = Scanner.nextInt();
			
			sum = A+B;
			
			System.out.println("Sum of A and B is : "+sum);		
			Scanner.close();
		}
}
