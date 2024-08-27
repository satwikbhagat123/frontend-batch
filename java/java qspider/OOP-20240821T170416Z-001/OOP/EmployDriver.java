class EmployDriver
{
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		System.out.println("Company Name is: "+Employ.comp_name);
		Employ.giveBiometric();
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		
		e2.comp_name="Diamond Company";
		e2.name="JOHN";

		System.out.println("Employ1 Company Name is: "+e1.comp_name);
		System.out.println("Employ2 Company Name is: "+e2.comp_name);
		System.out.println("Employ3 Company Name is: "+e3.comp_name);
		e1.giveBiometric();
		e2.giveBiometric();
		e3.giveBiometric();
		System.out.println("=========================================");
		System.out.println("Employ1 Name is: "+e1.name);
		System.out.println("Employ2 Name is: "+e2.name);
		System.out.println("Employ3 Name is: "+e3.name);

		




		


		
	}

}