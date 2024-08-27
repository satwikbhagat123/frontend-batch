import java.util.Scanner;
class Case2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter The Age: ");
		int age=sc.nextInt();
		System.out.println("ENter The Name: ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("ENter The Weight: ");
		double weight=sc.nextDouble();
		System.out.println("ENter The City: ");
		sc.nextLine();
		String city=sc.nextLine();
		System.out.println("ENter The Pin: ");
		int pin=sc.nextInt();
		System.out.println("ENter The Country: ");
		sc.nextLine();
		String country=sc.nextLine();
		System.out.println("ENter The EmailID: ");
		String emid=sc.nextLine();
		System.out.println("ENter The Language: ");
		String  language=sc.nextLine();
		System.out.println("Details are Below============: ");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age+"Years");
		System.out.println("Weight is: "+weight+"KG");
		System.out.println("City is: "+city);
		System.out.println("PIN is: "+pin);
		System.out.println("COuntry is: "+country);
		System.out.println("Email ID is: "+emid);
		System.out.println("Language is: "+language);
	}
}




