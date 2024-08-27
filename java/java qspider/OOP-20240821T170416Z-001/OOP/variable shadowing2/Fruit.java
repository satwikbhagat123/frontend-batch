class Fruit
{
	static int x=30;	
	public static void test(int x)
	{
		System.out.println("static test method");
		System.out.println("Local x is: "+x);
		System.out.println("static x is: "+Fruit.x);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts!!");
		int p=11;
		test(p);
	}
}