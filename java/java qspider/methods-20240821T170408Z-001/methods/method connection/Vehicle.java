class Vehicle
{
	public static void test()
	{
		System.out.println("This is test method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method of Vehicle");
		demo();
		System.out.println("main ends");
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		test();
		System.out.println("deom Ends");
	}
}