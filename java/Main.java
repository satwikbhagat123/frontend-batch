public class Main {
    static int a = 4667;
    
    public static void main(String[] args) {
        System.out.println("Starts main method");
        test();
        System.out.println("Ends main method");
    }
    public static void test(){
        System.out.println("Starts test method");
        int x = 45;
        System.out.println(x);
        System.out.println("Ends test method");
        System.out.println(Main.a);
    }
}
