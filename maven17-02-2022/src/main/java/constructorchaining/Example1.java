package constructorchaining;

public class Example1 {
	//methods communication
		public static void getText1()
		{
			System.out.println("Hiii");
		}
		
		public static void getText2()
		{
			System.out.println("This is Tejashwini");
			getText1();//getText2() method calling getText1() method
		}
		
		public static void main(String[] args)
		{
			getText2();//main() method calling getText2() method

		}
}
