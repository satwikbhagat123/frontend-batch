// Program for access Non-static variable using this keyword.
class FirstProgram{
    int a =45;
    public void start(){
        System.out.println("Start method");
        int a =34;
        System.out.println("Local variable a is:-"+ a);
        System.out.println("Non-static variable a is:"+ this.a);

    }
    public static void main(String[] args) {
        System.out.println("Main method starts");
        FirstProgram f1 = new FirstProgram();
        f1.start();
    }
}
