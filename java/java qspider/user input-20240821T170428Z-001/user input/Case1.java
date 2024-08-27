import java.util.Scanner;
class Case1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter The Name: ");
		String name=sc.nextLine();
		System.out.println("ENter The Age: ");
		int age=sc.nextInt();
		System.out.println("ENter The Weight: ");
		double weight=sc.nextDouble();
		System.out.println("Details are Below: ");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age+"Years");
		System.out.println("Weight is: "+weight+"KG");
	}
}