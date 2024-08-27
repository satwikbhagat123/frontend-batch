class Vehicle
{
	int a=48;	
	public void start()
	{
		System.out.println("non- static start method");
		int a=34;
		System.out.println("Local a is: "+a);
		System.out.println("non-static a is: "+this.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts!!");
		Vehicle v1=new Vehicle();
		v1.start();
	}

}