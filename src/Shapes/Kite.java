package Shapes;

public class Kite extends IFourAngeledShapes{
    public Kite(Integer diagonal1, Integer diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public void getArea() {
        System.out.println((diagonal1 * diagonal2)/2);
    }



}
