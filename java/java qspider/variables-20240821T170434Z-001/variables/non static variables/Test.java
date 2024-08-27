class Test
{
	static String s1="Mohan";
	static String s2;
	static Test t1;
	public static void main(String[] args)
	{
		System.out.println("This is Test class");
		Laptop dell=new Laptop();
		System.out.println("Laptop a is: "+dell.a);
		System.out.println("Laptop b is: "+dell.b);
		System.out.println("laptop c is: "+dell.c);
		System.out.println("====================");
		System.out.println("Fruit x is: "+Fruit.x);
		System.out.println("Fruit z is: "+Fruit.z);
		Fruit f1=new Fruit();
		System.out.println("Fruit y is: "+f1.y);
		System.out.println("Fruit p is: "+f1.p);
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("t1 is: "+t1);
	}
}


