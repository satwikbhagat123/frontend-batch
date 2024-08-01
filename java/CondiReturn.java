
public class CondiReturn {

    // public static int test() {

    //     for (int i = 0; i < 10; i++) {
    //         if (i == 5) {
    //             return 50;
    //         }
    //     }
    //     return 100;
    // }

    // public static void main(String[] args) {
    //     int result = test();
    //     System.out.println("result" + " " + result);
    // }
    public static int demo(){
        int a =10;
        if(a==10){
            return 10;
        }
        else{
            return 100;
        }
    }
    public static void main(String[] args) {
        int result = demo();
        System.out.println("result" + " "+ result);
    }
}
