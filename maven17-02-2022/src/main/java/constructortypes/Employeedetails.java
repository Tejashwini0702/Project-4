package constructortypes;
public class Employeedetails {
	//state(variables)
		int id;
		String name;
		double salary;
		String address;		
		public Employeedetails() {
			id = 2022;
			name = "Teju Reddy";
			salary = 58653.15;
			address = "Banglore";
		}		
		public Employeedetails(int id1, String name1, double salary1, String address1) 	{
			id = id1;
			name = name1;
			salary = salary1;
			address = address1;
		}
		//methods/behavior
		public void getInfo()	{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(address);
		}		
		public static void main(String[] args) 	{
			Employeedetails employee1 = new Employeedetails();
			employee1.getInfo();
			//System.out.println(employee1.hashCode());		
			System.out.println("=============");		
			Employeedetails employee2 = new Employeedetails();
			employee2.getInfo();
			//System.out.println(employee2.hashCode());			
			System.out.println("------------------------");		
			Employeedetails employee11 = new Employeedetails(11, "Raju", 45862.46, "Chennai");
			employee11.getInfo();		
			System.out.println("================");		
			Employeedetails employee12 = new Employeedetails(12, "Nikhil", 58647.68, "Hyderabad");
			employee12.getInfo();
}}
