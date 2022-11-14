package Shapes;

public abstract class RoundedShapes extends Shapes {
    public Integer radius;

    @Override
    public void getArea(){
        System.out.println(Math.PI*Math.pow(this.radius, 2));
    }


}
