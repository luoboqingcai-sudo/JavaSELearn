import java.util.ArrayList;

/**
 * manager all product's stock
 * using ArrayList container to record the object of Product class
 * @author luoboqingcai-sudo
 * @version 2020.10.23
 */
public class StockManager {
    private ArrayList<Product> products;

    public StockManager(){
        products = new ArrayList<Product>();
    }

    /**
     * print all products' information
     * using Product class method:toString()
     */
    public void printProductDetails(){
        for (Product product : products){
            System.out.println(product.toString());
            // foreach 循环是否可以进行赋值操作，即productNew = product是否成立
        }
    }

    /**
     * find product by id
     * @param ID :the id of product needed to find
     * @return :if find the product, return the object;else return null
     */
    public Product findProduct(String ID){
        Product result = null;
        int circulationFlag = 0;
        int amount = products.size();
        for(circulationFlag = 0; circulationFlag < amount; circulationFlag++){
            if(ID.equals(products.get(circulationFlag).getID())){
                result = products.get(circulationFlag);
                break;
            }
        }
        return result;
    }

    /**
     * get the product' number of stock by name
     * @param ID :the id of product needed to find
     * @return :if find the product, return the number of stock;else return 0
     */
    public int numberInStock(String ID){
        int result = 0;
        Product product = this.findProduct(ID);
        if(product != null){
            result = product.getStock();
        }
        return result;
    }

    /**
     * increase the number of stock by id
     * @param ID :the id of product
     * @param increaseQuantity :needed greater than or equal to 0
     * @return :if success in increasing, return true, else return false
     */
    public boolean delivery(String ID, int increaseQuantity){
        boolean result = false;
        Product product = this.findProduct(ID);
        if(product != null){
            product.increaseQuantity(increaseQuantity);
            result = true;
        }
        return result;
    }

    /**
     * print the information of stock that number in stock below param
     * @param numberInStock :the standard of number compared
     */
    public void printLowStockProduct(int numberInStock){
        int circulationFlag = 0;
        int amount = products.size();
        for(circulationFlag = 0; circulationFlag < amount; circulationFlag++){
            if(products.get(circulationFlag).getStock() < numberInStock){
                System.out.println(products.get(circulationFlag).toString());
            }
        }
    }

    /**
     * add product to products arraylist
     * @param product :object of Product class
     * @return :if there's no repeat id, return true, else return false
     */
    public boolean addProduct(Product product){
        boolean result = false;
        if(this.findProduct(product.getID()) == null){
            products.add(product);
            result = true;
        }
        return result;
    }

    public boolean addProduct(String ID, String name, int numberInStock){
        Product product = new Product(ID, name, numberInStock);
        return this.addProduct(product);
    }

    public boolean addProduct(String ID, String name){
        return this.addProduct(ID, name, 0);
    }

    public Product findProductByName(String name){
        Product result = null;
        int circulationFlag = 0;
        int amount = products.size();
        for(circulationFlag = 0; circulationFlag < amount; circulationFlag++){
            if(name.equals(products.get(circulationFlag).getName())){
                result = products.get(circulationFlag);
                break;
            }
        }
        return result;
    }
}
