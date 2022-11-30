package CompareSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserComparison implements Comparable <UserComparison> {
    private String firstName;
    private String lastName;
    private byte age;
    private int height;

    public byte getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args){
        UserComparison user1 = new UserComparison("Zed", "P", (byte) 28, 158);
        UserComparison user2 = new UserComparison("Maryia", "Pen", (byte) 28, 160);
        UserComparison user3 = new UserComparison("Maryia", "Paklo", (byte) 35, 157);

        List<UserComparison> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users);
        for(UserComparison user: users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " age: " + user.getAge() + " height: " + user.getHeight());
        }
    }

    public UserComparison(String firstName, String lastName, byte age, int height) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.height = height;
    }

    @Override
    public int compareTo(UserComparison user){
        int length;
        int i = 0;
        int result;

        if(this.firstName.length() > user.getFirstName().length()){
            length = this.firstName.length();
        } else {
            length = user.getFirstName().length();
        }

        //System.out.println(length);

        while(i < length ) {
            result =  this.firstName.charAt(i) - user.getFirstName().charAt(i);
            i++;
            if (result != 0) {
                return result;
            }

        }

        i = 0;

        if(this.lastName.length() > user.getLastName().length()){
            length = this.lastName.length();
        } else {
            length = user.getLastName().length();
        }

        while(i < length) {
            result = this.lastName.charAt(i) - user.getLastName().charAt(i);
            i++;
            if (result != 0) {
                return result;
            }

        }

        result = this.age - user.getAge();
        if (result != 0) {
            return result;
        }

        result = this.height - user.getHeight();
        if (result != 0) {
            return result;
        }

        return 0;

    }
}


/*
    Create a class User which implements
    comparable.
    FIELDS: firstname, lastname, age, height

    sort by these fields in the same order
 */