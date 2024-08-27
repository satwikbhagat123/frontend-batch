class Program5
{
	
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		double sum=test(20, 30);
		System.out.println("Sum is: "+sum);
	}
	public static double test(int a, int b)
	{
		System.out.println("This is test method");
	return a+b;	
	}
}