class Program2
{
	public static int test()
	{
		System.out.println("This is test method");
		int x=12;
		int y=40;
	return x+y;	
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		int sum=test();
		System.out.println("Sum is: "+sum);
	}
}