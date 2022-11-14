package Shapes;

public class Cylinder extends ThreeDimenshionalShapes {
    public Cylinder(Integer radius, Integer height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void getVolume(){
        System.out.println(Math.PI*Math.pow(this.radius, 2)*this.height);
    }
}
