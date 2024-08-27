import java.util.Scanner;
class RectangleDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		Rectangle r4=new Rectangle();
		System.out.print("ENter the Length of 1st Rectangle: ");
		double l1=sc.nextDouble();
		System.out.print("ENter the Width of 1st Rectangle: ");
		double w1=sc.nextDouble();
		r1.setValue(l1,w1);
		r2.setValue(34.5, 21.6);
		r3.setValue(50, 21.4);
		r4.setValue(33, 22);
		
		r1.getArea();
		r1.getPerimeter();
		System.out.println("=======================");
		r2.getArea();
		r2.getPerimeter();
		System.out.println("=======================");
		r3.getArea();
		r3.getPerimeter();
		System.out.println("=======================");
		r4.getArea();
		r4.getPerimeter();
		System.out.println("=======================");



		
	}
}



