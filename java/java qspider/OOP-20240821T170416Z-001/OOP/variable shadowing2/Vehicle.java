class Vehicle
{
	int a=48;	
	public void start(int a)
	{
		System.out.println("non- static start method");
		System.out.println("Local a is: "+a);
		System.out.println("non-static a is: "+this.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts!!");
		Vehicle v1=new Vehicle();
		v1.start(444);
	}

}