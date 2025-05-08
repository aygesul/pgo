public class ComputerStore {
    Product[] products;
    Customer[] customers;
    Order[] orders;
    int productCount;
    int customerCount;
    int orderCount;





    //METHODS
    public void addProduct(Product product){};
    public void addCustomer(Customer customer){};
    public void createOrder(Customer customer, Product[] products, int[] quantities){};
    public void updateStockAfterOrder(Order order){};
    public void changeOrderStatus(int orderId, String newStatus){};
    public void displayProductsInCategory(String category){};
    public void displayCustomerOrders(int customerId){};

}
