
public class Pattern18 {
    public static void main(String[] args)
	{
		int i=1;
        int sum=0;
        while(i<=100){
            sum=sum+i*(i+1);
            i++;
        }
        System.out.println("sum is:"+sum);
    }
}
