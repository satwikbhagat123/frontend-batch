import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		double num1=sc.nextDouble();
		System.out.println("ENter the 2nd Number: ");
		double num2=sc.nextDouble();
		double sum=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
		
		
	}
}