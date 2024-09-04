//take user input and print number is prime or not prime
//this program takes less time to execute than the Pattern11 program
import java.util.Scanner;
class PrimeNumber1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(isPrime(n))
			System.out.println(n+" is a Prime number");
		else
			System.out.println(n+" is NOT a Prime number");
	}
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		int i=2;
		while(i*i<=n){
			if(n%i==0){
				return false;
			}
		i++;
		}
	return true;
	}
}