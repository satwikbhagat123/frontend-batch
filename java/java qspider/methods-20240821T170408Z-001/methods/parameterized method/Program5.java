class Program5
{
	
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		int a=284;
		printDigitSum(a);
	}
	public static void printDigitSum(int n)
	{
		int digit1=n%10;
		n=n/10;
		int digit2=n%10;
		n=n/10;
		int digit3=n%10;
		int sum=digit1+digit2+digit3;
		System.out.println("Digit sum is: "+sum);
	}
}