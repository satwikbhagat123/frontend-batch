//take user input and print and count all the factors of the number
import java.util.Scanner;
public class Pattern10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int i=1;
        int count=0;
        System.out.println("all the factors of "+n+" are below: ");
        while(i<=n/2){
            if (n%i==0){
                System.out.println(i+" ");
                count++;
            }
        i++;
        }
        System.out.println("\nall factors are: "+count);
    }
}
