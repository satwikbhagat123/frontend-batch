class Program3
{
	
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		int a=34;
		int b=12;
		printProduct(a,b);
	}
	public static void printProduct(int x, int y)
	{
		int prod=x*y;
		System.out.println("Product is: "+prod);
	}
}