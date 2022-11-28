package Collections;

import ClassWork.Car;
import ENUMS.Type;
import KnightGame.BlackKnight;

import java.util.*;

public class ContractExample {
    public static void main(String[] args){
//        Map<Integer, String> map = new HashMap<>();
//        map.put("sam");
//
//        Integer one = 1;
//        Integer otherOne = 1;
//
//        System.out.println(one.hashCode() == otherOne.hashCode());
//
//        BlackKnight knight1 = new BlackKnight("maryia");
//        BlackKnight knight2 = new BlackKnight("maryia");
//        System.out.println(knight1.equals(knight2));
//
//        List<BlackKnight> knights = Arrays.asList(knight1, knight2);
//        System.out.println(knights.contains(new BlackKnight("maryia")));
//
//        Set<BlackKnight> knights2 = new HashSet<>();
//        knights2.add(knight1);
//        knights2.add(knight2);



        Car car1 = new Car("mazDa", Type.MANUAL);
        Car car2 = new Car("MAZDA", Type.MANUAL);
        Car car3 = new Car("mazda", Type.AUTOMATIC);
//        Set<Car> cars = new HashSet<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
        System.out.println("equals result is: " + car1.equals(car2));
        System.out.println("hashcode result is: " + (car1.hashCode() == car2.hashCode()));


    }


}
