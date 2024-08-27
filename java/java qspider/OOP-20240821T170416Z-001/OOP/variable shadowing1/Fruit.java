class Fruit
{
	static int x=30;	
	public static void test()
	{
		System.out.println("static test method");
		int x=45;
		System.out.println("Local x is: "+x);
		System.out.println("static x is: "+Fruit.x);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts!!");
		test();
	}

}