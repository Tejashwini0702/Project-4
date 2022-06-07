package variabletypes;
public class Organization {
	int organizationId;
	String organizationName;
	static String orgType = "Information Technology";
	public Organization(int organizationId, String organizationName) 
	{
		this.organizationId = organizationId;
		this.organizationName = organizationName;
	}	
	public static void main(String[] args) {
		Organization organization1 = new Organization(3694, "Infosys");	
		System.out.println(organization1.organizationId);
		System.out.println(organization1.organizationName);
		System.out.println(Organization.orgType);	
		System.out.println("====================");		
		Organization organization2 = new Organization(2548, "Genpact");		
		System.out.println(organization2.organizationId);
		System.out.println(organization2.organizationName);
		System.out.println(Organization.orgType);
		
	}
	}
