
// public class A {

//     public static void main(String[] args){
//         System.out.println('@');
//         System.out.println('A'+10);
//         System.out.println('a'+20);
//         System.out.println('A'>'d');
//         System.out.println('2'+2);
//         System.out.println('7'+15-48);
//         System.out.println('4'+15-'0');
//         System.out.println('2'+'2');
// int x = 40;
// int y= 35;
// int z = x+y;
// System.out.println("The value of x is:"+ 'x');
// System.out.println("The value of x is:"+ "x");
// System.out.println("The value of x is:"+ x);
// System.out.println("The value of x is:"+ z);
// System.out.println("The value of x is:"+ y);
// System.out.println("The sum of" + x + "and"+ y + "is" + z);
// System.out.println("The sum of" + y + "and"+ y + "is" + z);
// int x = 64;
// int  y = 20;
// System.out.println("the sum is "+x+y); // output = The value is :84
// System.out.println(x+y+"is the sum"); // output 84is the sum
// System.out.println(x+y+ "the value  is" + x + y); // output 84the value  is6420
// System.out.println("the value  is" + (x + y)); // output the value  is84
// System.out.println("the value  is"+ (x-y)); // output the value  is44
// System.out.println("the value  is"+ (y-x)); // output the value  is-44
// System.out.println("the value  is"+ x*y); // output the value  is1280
// System.out.println("the value  is"+ x/y); // output the value  is3
// System.out.println("the value  is"+ x%y); // output the value  is4
// System.out.println(10+'d'+30*4+"abc"+40+'d'+x+(y-12)+80); // output 230abc40d64880
// System.out.println(x-y +"the value  is"); // output 44the value  is
//     }
    
// }

//  Local variable
// public class A{
//     static int x1 = 50;
//     public static void main(String[]args){
//         // int x = 90;
//         // int y = 20;
//         // int z = x+y;
//         System.out.println("The value of z:="+ x1);
//         System.out.println("The value of z:="+ A.x1);
//     }
// }

// Non- static numbers

// public  class Fruit{
//     int x = 40;
//     int y = 50;
//     double z = 50.23;
//     public static void main(String[] args) {
//         Fruit f = new Fruit();
//         System.out.println("The value of x is:"+ f.x);
//         System.out.println("The value of y is:"+ f.y);
//         System.out.println("The value of z is:"+ f.z);
//     }
// }

// Static numbers
// public class Employ{
//     static  String comp_name ="ABC";
//     static int  emp_id = 202;
//     static String emp_name ="Rahul";
//     public static void main(String[] args) {
//         System.out.println(Employ.comp_name);
//         System.out.println(emp_id);
//         System.out.println(emp_name);
//     }
// }

// typecasting

// public class Type{
//     public static void main(String[] args) {
//         double x = 520.23;
//         int y = (int)x;
//         System.out.println(x);
//         System.out.println(y);

//     }
// }

//  public class Car{
//     int x = 30;
//     public static void main(String[] args) {
//         Car c1 = new  Car();
//         System.out.println(c1.x);
//     }
// }

//  public  class Fruit{
//     double p = 45;
// }
// class Demo{
//     public static void main(String[] args) {
//         // Car c1 = new Car();
//         // System.out.println(c1.x);
//         Fruit f = new Fruit();
//         System.out.println(f.p);
//     }
// }


// First charachterstic of java
class Car{
    static int x = 45;
    int y = 50;
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.y);
        java1 j = new java1();
        System.out.println(j.a);
        System.out.println(j.p);
        // System.out.println(x);
        // System.out.println(Car.x);
        
        
    }
}