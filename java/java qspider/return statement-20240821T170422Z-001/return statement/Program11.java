class Program11
{
	public static void main(String[] args)
	{
		System.out.println("main method Starts");
		int x=340;
		int y=45;
		int big=getBig(x,y);
		System.out.println("Big from "+x+" and "+y+" is: "+big);	
	}
	public static int getBig(int x, int y)
	{
		if(x>y){
			return x;
		}
	return y;
	}

}