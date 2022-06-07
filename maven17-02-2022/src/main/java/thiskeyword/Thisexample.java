package thiskeyword;
	//this keyword: class fields/variables we can differentiate from parameters of constructors/methods
	public class Thisexample 
	{		
		//state(variables)
		int id;
		String name;
		double salary;
		String address;		
		public Thisexample(int id, String name, double salary, String address) 
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.address = address;
		}
		//methods/behavior
		public void getInfo()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(address);
		}
		public static void main(String[] args) {
		Thisexample employee11 = new Thisexample(11, "Teju", 95846.45, "Banglore");
			employee11.getInfo();			
			System.out.println("================");
			Thisexample employee12 = new Thisexample(12, "Raju", 93583.44, "Hyderabad");
			employee12.getInfo();
			}}


