import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		int num1=sc.nextInt();
		System.out.println("ENter the 2nd Number: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
		
		
	}
}