/*
    Users => name, balance
    Sales => records per user

    get all users sorted by  name
    get all users sorted by  balance ASC
    get all users sorted by most paying DESC
 */

package UsersAndSales;

import KnightGame.BlackKnight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales implements Comparable<Sales> {
    private static int count = 0;
    private User1 user;
    private Product product;
    private static float revenue = 0.00f;

    public Sales(User1 user, Product product){
        this.user = user;
        this.product = product;
        user.setBalance(getUser().getBalance() - getProduct().getPrice());
        setRevenue(getRevenue() + getProduct().getPrice());
    }

    public Product getProduct() {
        return product;
    }

    public User1 getUser() {
        return user;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString(){
        return "\n\nUser " + user.getName() +
                " bought product ==> " + product.getProductName() + " <== " +
                " by the price " + product.getPrice() +
                "\now User's balance is: " + user.getBalance() +
                "\n the sales revenue now is:" + revenue;
    }

    public static void main(String[] args){
        User1 user1 = new User1("maryia", 350.00f);
        User1 user2 = new User1("sam", 550.00f);
        User1 user3 = new User1("vlad", 25.00f);

        Product product1 = new Product("book", 100.00f);
        Product product2 = new Product("advent calendar", 550.00f);
        Product product3 = new Product();

        Sales sales1 = new Sales(user1, product1);
        Sales sales2 = new Sales(user2, product2);
        Sales sales3 = new Sales(user3, product3);


        List<Sales> sales = new ArrayList<>();
        sales.add(sales1);
        sales.add(sales2);
        sales.add(sales3);

        for(Sales sale: sales){
            System.out.println(sale.toString());
        }








    }


    @Override
    public int compareTo(Sales o) {


        return 0;
    }
}
