/**
 * @author louboqingcai-sudo
 * @version 2020.10.24
 */
public class StockDemo {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        Product product = new Product("20201024", "test", 100);
        stockManager.addProduct(product);
        stockManager.addProduct("20201025", "912", 50);
        stockManager.addProduct("20201026","1025");
        stockManager.addProduct(product);
        stockManager.printProductDetails();

        Product product1 = stockManager.findProduct("20201024");
        System.out.println("find product: " + product1.toString());

        Product product2 = stockManager.findProductByName("test");
        System.out.println("find product by name 'test': " + product2.toString());

        System.out.println("print products' stock below 50:");
        stockManager.printLowStockProduct(50);

        stockManager.delivery("20201025", 50);
        System.out.println("after deliver 50: " + stockManager.numberInStock("20201025"));
    }
}
