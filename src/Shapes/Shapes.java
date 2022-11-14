package Shapes;

public abstract class Shapes {
//    public Integer length;
//    public Integer width;

    public abstract void getArea();

    public static void main(String[] args){
        Parallelogram myP = new Parallelogram(6, 3);
        Kite myK = new Kite(5, 7);
        Rhombus myR = new Rhombus(6);
        Triangle myT = new Triangle(6, 3);
        Circle myCircle = new Circle(10);
        Cylinder myCylinder = new Cylinder(6, 3);

        System.out.print("Parallelogram area: ");
        myP.getArea();
        
        System.out.print("\nKite area: ");
        myK.getArea();
        
        System.out.print("\nRhombus area: ");
        myR.getArea();

        System.out.print("\nTriangle area: ");
        myT.getArea();
        
        System.out.print("\nCircle area: ");
        myCircle.getArea();

        System.out.print("\nCylinder VOLUME: ");
        myCylinder.getVolume();


        



    }

}


/** Parallelogram
 * Kite (d1*d2/2)
 * Triangle
 * Circle
 * Cylinder
 * Rhombus
 * **
 */