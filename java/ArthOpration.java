public class ArthOpration {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Addition of a and b" + ": " + add(3, 5));
        System.out.println("substraction of a and b" + ": " + sub(3, 5));
        System.out.println("division of a and b" + ": " + divide(3, 5));
    }
}
