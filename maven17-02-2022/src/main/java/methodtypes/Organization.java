package methodtypes;
public class Organization {
	int organizationId;
	String organizationName;
	static String orgType = "Information Technology";

	public Organization(int organizationId, String organizationName) {
		this.organizationId = organizationId;
		this.organizationName = organizationName;
	}
	public void getOrgInfo()	{
		//these methods will support all variables
		System.out.println(organizationId);
		System.out.println(organizationName);
		System.out.println(orgType);
	}
	public static void getOrgType(){
		//these methods support only static variables
		System.out.println(orgType);
	}
	public static void main(String[] args) 
	{

		Organization organization1 = new Organization(1234, "Genpact");

		organization1.getOrgInfo();
		System.out.println("====================");

		Organization organization2 = new Organization(9603, "Infosys");

		organization2.getOrgInfo();

	}



}
