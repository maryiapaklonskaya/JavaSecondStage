package Shapes;

public class Circle extends RoundedShapes{
    public Circle(Integer radius){
        this.radius = radius;
    }

    @Override
    public void getArea(){
        System.out.println(2*Math.PI*radius);
    }
}
