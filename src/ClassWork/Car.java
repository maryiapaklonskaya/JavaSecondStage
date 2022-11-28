package ClassWork;

import ENUMS.Type;
import KnightGame.BlackKnight;

public class Car {
    private String name;
    private Type type;

    public Car(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return (name.toLowerCase().equals(car.getName().toLowerCase()) && (type == car.getType()));
    }

    @Override
    public int hashCode(){
        int result = name.toLowerCase().hashCode() + type.hashCode();

        return result;
    }




}
