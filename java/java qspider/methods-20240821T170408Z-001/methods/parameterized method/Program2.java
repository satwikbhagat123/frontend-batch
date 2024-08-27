class Program2
{
	
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		int x=34;
		int y=15;
		printProduct(x,y);
	}
	public static void printProduct(int x, int y)
	{
		int prod=x*y;
		System.out.println("Product is: "+prod);
	}
}