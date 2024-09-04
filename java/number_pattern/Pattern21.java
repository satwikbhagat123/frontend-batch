
public class Pattern21 {
    public static void main(String[] args)
	{
		int i=1;
        double sum=0;
        while(i<=100){
            sum=sum+(1.0/i);
            i++;
        }
        System.out.println("sum is:"+sum);
    }
}
