package methods;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args) {
		//java program to print Learner information(name,id,age,address)
		String  LearnerName;
		int LearnerID;
		int LearnerAge;
		String LearnerAddress ;
		Scanner Scanner =new Scanner(System.in);
		
		System.out.println("Enter Learner ID :");
		LearnerID = Scanner.nextInt();
		
		System.out.println("Enter Learner NAME :");
		LearnerName = Scanner.next();//n
		
		System.out.println("Enter Learner Age :");
		LearnerAge= Scanner.nextInt();
		
		System.out.println("Enter Learner Address :");
		LearnerAddress = Scanner.next();
		
		System.out.println("===============");
		
		System.out.println(" Learner ID :");
		System.out.println( LearnerID);
		System.out.println(" Learner Name :");
		System.out.println( LearnerName);
		System.out.println(" Learner 	Age :");
		System.out.println( LearnerAge);
		System.out.println(" Learner Address :");
		System.out.println( LearnerAddress);
		Scanner.close();
	}
}
