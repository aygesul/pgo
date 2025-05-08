public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String status;

    Order(int id, Customer customer, Product[] products, int[] quantities, String orderDate, String status) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = orderDate;
        this.status = status;
    }

    //METHODS
    public void calculateTotalValue() {
        double total=0;
        for(int i = 0; i < products.length; i++) {
            double price;

            price = products[i].getPrice();
            total += price * quantities[i];

        }
        System.out.println("Total value is: " + total);


        }



    public void applyDiscount(){
       double discountedPrice = 0;
        if(customer.isLoyalCustomer()){
          for (Product product : products) {
              double originalPrice = product.getPrice();
              discountedPrice = originalPrice *0.90;
              System.out.println("Discounted price: " + discountedPrice);
          };
        }
        else System.out.println("no discount");
    }

    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Products: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " x " + quantities[i]);
        }
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Status: " + getStatus());

        calculateTotalValue();
        applyDiscount();



    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product[] getProducts() {
        return products;
    }
    public int[] getQuantities() {
        return quantities;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public String getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
