class Program3
{
	public static void main(String[] args)
	{
		int a=20;
		int b=a++;
		a--;
		int c=a++ + ++b;
		int d=a-- - --a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}