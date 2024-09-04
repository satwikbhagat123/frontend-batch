
public class Pattern22 {
    public static void main(String[] args)
	{
		int i=1;
        double sum=0;
        while(i<=100){
            sum=sum+(1.0/(i*i));
            i++;
        }
        System.out.println("sum is:"+sum);
    }
}
