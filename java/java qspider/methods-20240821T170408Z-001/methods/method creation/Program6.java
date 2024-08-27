class Program6
{
	
	synchronized strictfp public final static void main(String[] args)
	{
		printDigit();
		
	}
	final synchronized strictfp public static void printDigit()
	{
		int a=492;
		System.out.println("The Number is: "+a);
		System.out.println("The 1st digit is: "+a%10);
		a=a/10;
		System.out.println("The 2nd digit is: "+a%10);
		a=a/10;
		System.out.println("The 3rd digit is: "+a%10);
	}
}