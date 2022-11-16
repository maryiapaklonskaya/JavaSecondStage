package Encapsulation;

import ENUMS.Gender;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class User {
// Create a simple class with private fields and setters and getters
// to represent a user [id, name, age, dob, gender]
    private Integer userID;
    private String name;
    private byte age;
    private LocalDate dob;
    private Gender gender;

    class User

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        if(age>=18){
            this.age = age;
        } else {
            System.out.println("User should be older or equal to 18 years old");
        }
    }

    public void setDob(LocalDate dob) {
        LocalDate today = LocalDate.now();
        byte difference = (byte) (today.getYear() - dob.getYear());
        if(difference==age){
            this.dob = dob;
        }else{
            System.out.println("The date is not right");
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getUserID() {
        return userID;
    }
}
