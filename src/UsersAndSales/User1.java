/*
    Users => name, balance
    Sales => records per user

    get all users sorted by  name
    get all users sorted by  balance ASC
    get all users sorted by most paying DESC
 */

package UsersAndSales;

import java.util.*;


public class User1 implements Comparable <User1>{
    private int id;
    private String name;
    private float balance;

    public User1(String name, float balance){
        id++;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }






    @Override
    public String toString(){
        return "User " + name + ", balance: " +  balance;
    }

    @Override
    public int compareTo(User1 user){
        int length;
        int i = 0;
        int result;

        if(this.name.length() > user.getName().length()){
            length = this.name.length();
        } else {
            length = user.getName().length();
        }

        while(i < length) {
            result =  this.name.charAt(i) - user.getName().charAt(i);
            i++;
            if (result != 0) {
                return result;
            }

        }

        result = (int) (this.balance - user.getBalance());
        if (result != 0) {
            return result;
        }

        return 0;

    }



    public static void main(String[] args) {
        User1 user1 = new User1("maryia", 350.00f);
        User1 user2 = new User1("crowley", 550.00f);
        User1 user3 = new User1("vlad", 25.00f);
        User1 user4 = new User1("maryia", 150.00f);
        User1 user5 = new User1("crowley", 650.00f);
        User1 user6 = new User1("vlad", 24.00f);
        User1 user7 = new User1("maryia", 250.00f);
        User1 user8 = new User1("crowley", 750.00f);
        User1 user9 = new User1("vlad", 23.00f);

        List<User1> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);

//        Collections.sort(users);
//        for (User1 user : users) {
//            System.out.println(user.getName() + " balance: " + user.getBalance());
//        }

        usersSort(users);

    }



    public static void usersSort(List<User1> users) {
        Map<String, List<User1>> usersMap = new HashMap<>();

        for (User1 user : users) {
            if (usersMap.containsKey(user.getName())) {
                usersMap.get(user.getName()).add(user);
            } else {
                List<User1> users1 = new ArrayList<>();
                users1.add(user);
                usersMap.put(user.getName(), users1);
            }
        }

        usersMap.forEach((key, value) -> System.out.println(key + ":" + value));
    }




//        public void sortByBalance(List<User1> users) {
//
//            Collections.sort(users, new Comparator<User1>() {
//                @Override
//                public int compare(User1 u1, User1 u2) {
//                    return ((int) u1.getName().charAt(0) - (int) u2.getName().charAt(0));
//                }
//
//            });
//
//            for (User1 user : users) {
//                System.out.println(user.getName() + " balance: " + user.getBalance());
//            }
//        }



    }





