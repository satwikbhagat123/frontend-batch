class Program1
{
	
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		test(12, 23);
		System.out.println("main method ends");
	}
	public static void test(int x, int y)
	{
		System.out.println("This is test method");
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		int sum=x+y;
		System.out.println("Sum is: "+sum);
	}
}