package Inheritence;

import java.time.LocalDate;

public class Inheritence {

    public static void main(String[] args){
        //Object SportsCarFromParent = new Inheritence.SportsCar();
        LocalDate date = LocalDate.now();
        SportsCar SportsCar = new SportsCar(date);
        SportsCar.drive();
        SportsCar.carInfo();

    }

}

//PARENT CLASS
//public OR protected - will be accessible to any inhetited class
// PRIVATE - could be accessed ONLY inside a class

class Car {
    //fields should be private
    private LocalDate manufacturingDate;
    public Car(LocalDate manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }

    public void turnOnEngine(){
        System.out.println("engine is running...");
    }

    public LocalDate getManufacturingDate(){
        return manufacturingDate;
    }
}

//CHILD CLASS

class SportsCar extends Car {
    private LocalDate manufacturingDate;
    public SportsCar(LocalDate manufacturingDate){
        super(manufacturingDate); //passed to the manufacturing of the parent class
    }
//DECORATOR @OVERRIDE
// you could change the method from the parent class

    @Override
    public void turnOnEngine(){
        System.out.println("I am driving SPORTSCAR...");
    }
    public void drive() {
        turnOnEngine();
        System.out.println("I am driving...");

    }

    public void carInfo(){
        System.out.println("Inheritence.Car was built on:" + this.getManufacturingDate());
    }
}