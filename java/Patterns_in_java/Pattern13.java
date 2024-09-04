//take user input and write a java program to find power
import java.util.Scanner;
class Pattern13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println(a+" to power "+b+" is: "+getPower(a,b));
	}
	public static int getPower(int a, int b){
		int pow=1;
		int i=1;
		while(i<=b){
			pow=pow*a;
		i++;
		}
	return pow;
	}
}