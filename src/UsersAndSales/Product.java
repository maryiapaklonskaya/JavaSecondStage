package UsersAndSales;


public class Product {
    private static int count;
    private String productName = "product N" + count++;
    private float price = (float) 24.99;

    public Product(){}

    public Product(String productName, float price){
        this.productName = productName;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString(){
        return "Product " + productName + " costs " + price;
    }


}
