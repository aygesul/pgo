public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Airpods","Earphones",1000,20);
        Customer customer1 = new Customer(1,"Eda Tuana","Uysal","edatuanauysal@gmail.com",true);
        Customer customer2 = new Customer(2,"Hakan","Yaren","hakanyaren@gmail.com",true);
        Product[] products = {product1};
        int[] quantities = {2};
        Order order1 = new Order(2,customer2,products,quantities, "09.04.2025","in progress");

        product1.displayInfo();
        customer1.displayInfo();
        order1.displayDetails();


    }
}