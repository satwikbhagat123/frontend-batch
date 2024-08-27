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

		e1.getDetails();
		e2.getDetails();
		e3.getDetails();

	}

}