//take user input and print number is prime or not prime
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		checkPrime(n);
	}
	public static void checkPrime(int n){
		int i=2;	int count=0;
		while(i<=n/2){
		System.out.println("Loop Execution is: "+(i-1));
			if(n%i==0){
				count++;
			}
		i++;
		}
		if(count==0)
			System.out.println(n+" is a Prime number");
		else
			System.out.println(n+" is NOT a Prime number");
	}
}