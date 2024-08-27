class EmployDriver
{
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();

		e1.setValue("Mohan", 123, 34647.57);
		e2.setValue("Sohan", 103, 32647.57);
		e3.setValue("Rohan", 173, 30647.57);



		System.out.println("================Employ1 Details===");
		System.out.println("Employ1 Object address is: "+e1);
		System.out.println("Employ1 Name is: "+e1.name);
		System.out.println("Employ1 ID is: "+e1.id);
		System.out.println("Employ1 Salary is: "+e1.salary);
		System.out.println("=================Employ2 Details===");
		System.out.println("Employ2 Object address is: "+e2);
		System.out.println("Employ2 Name is: "+e2.name);
		System.out.println("Employ2 ID is: "+e2.id);
		System.out.println("Employ2 Salary is: "+e2.salary);
		System.out.println("=================Employ3 Details===");
		System.out.println("Employ3 Object address is: "+e3);
		System.out.println("Employ3 Name is: "+e3.name);
		System.out.println("Employ3 ID is: "+e3.id);
		System.out.println("Employ3 Salary is: "+e3.salary);
	}

}