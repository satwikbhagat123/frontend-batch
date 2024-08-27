class LaptopDriver {
    public static void main(String[] args) {
        Laptop l1= new Laptop("lenevo",65000.59,5);
        Laptop l2= new Laptop("dell",55000.27,2);
        Laptop l3= new Laptop("hp",45000.68,4);


        l1.getDetails();
        l2.getDetails();
        l3.getDetails();
        
    }
}
