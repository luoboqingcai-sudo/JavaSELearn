/**
 * 用来描述公司出售的产品
 * 记录了产品的ID、名字和当前库存
 * @author luoboqingcai-sudo
 * @version 2020.10.23
 */
public class Product {
    private String ID;
    private String name;
    private int stock;

    public Product(String ID, String name, int stock){
        this.ID = ID;
        this.name = name;
        if(stock >= 0){
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    public Product(String ID, String name){
        this(ID, name, 0);
    }

    public String getID() {
        return ID;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    /**
     * increase the quantity of stock
     * @param quantity:the quantity of increment
     * @return the current quantity of stock
     */
    public int increaseQuantity(int quantity){
        if(quantity >= 0){
            stock += quantity;
        }
        return stock;
    }

    /**
     * sell one product
     * @return the current quantity of stock, if not enough, return -1
     */
    public int sellOne(){
        int result;
        if(stock > 1){
           result = --stock;
        } else{
            result = -1;
        }
        return result;
    }

    /**
     * the information of product
     * @return the information of product, and transform into string
     */
    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
