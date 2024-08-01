
import java.util.Scanner;

class Evenodd {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            EvenOdd(n);
        }

    }

    public static void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "is even"); 
        }else {
            System.out.println(n+ " " +  "is odd");
        }

    }
}
