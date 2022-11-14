package Shapes;

public class Triangle extends ITriangle{
    public Triangle(Integer height, Integer triangleBaseSide){
        this.height = height;
        this.triangleBaseSide = triangleBaseSide;
    }

    @Override
    public void getArea(){
        System.out.println((1/2*height*triangleBaseSide));
    }
}
