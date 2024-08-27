class Laptop {

    String name;
    double price;
    int noOfLaptop;

    Laptop (String name, double price, int noOfLaptop) {
        this.name = name;
        this.price = price;
        this.noOfLaptop = noOfLaptop;
    }

    public void getDetails() {
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("no of Laptop you want:" + noOfLaptop);
        System.out.println( "============================");   
    }
}
