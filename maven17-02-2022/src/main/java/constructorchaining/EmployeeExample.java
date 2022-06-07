package constructorchaining;
public class EmployeeExample {
	//state(variables)
		int id;
		String name;
		double salary;
		String address;		
		//default
		public EmployeeExample() 	{
			this(11, "Teju", 96034.57, "Hyderabad");//default constructor is calling parameterized constructor
			id = 2020;
			name = "Raju Reddy";
			salary = 77502.84;
			address = "Banglore";
			System.out.println("Default");
		}		
		//parameterized
		public EmployeeExample(int id, String name, double salary, String address) 
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.address = address;
			System.out.println("Parameterized.");
		}

		//methods/behavior
		public void getInfo()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(address);
		}
		public static void main(String[] args) 
		{
			new EmployeeExample();
					
			System.out.println("------------------------");
			
			new EmployeeExample(11, "Teju", 96034.57, "Hyderabad");		
		}	
		
		}
