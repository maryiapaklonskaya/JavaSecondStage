package Inheritence.Market;

public class Product {
    private Double price;
    private Integer productID;
    static Integer counter = 1;
    //static values in the class, not unique, interobjects counter

    public Product(Double price){
        this.price = price;
        this.productID = counter++;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getProductID(){
        return productID;
    }
}
