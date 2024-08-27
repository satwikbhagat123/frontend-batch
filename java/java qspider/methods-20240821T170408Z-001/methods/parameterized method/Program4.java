class Program4
{
	
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		int a=34647;
		printDigit(a);
	}
	public static void printDigit(int n)
	{
		System.out.println("The Number is: "+n);
		System.out.println("Last Digit is: "+n%10);
		System.out.println("Last Two Digit is: "+n%100);
	}
}