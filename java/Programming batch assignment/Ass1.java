import java.util.Scanner;
class Ass1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int n=sc.nextInt();
         getDigits(n);
        System.out.println("the number is: "+n);
    }
    public static int getDigits(int n){
        while(n>0)
        {
            int rem=n%10;
            
            n=n/10;
           
        }
        return n;
    } 
}