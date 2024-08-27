class Program1
{
	public static void test()
	{
		System.out.println("This is test method");
		
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method of Program1");
		test();
		System.out.println("======================");
		Program1.test();
	}
}