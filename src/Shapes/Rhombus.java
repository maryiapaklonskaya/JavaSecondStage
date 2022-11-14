package Shapes;

class Rhombus extends IFourAngeledShapes{
    public Rhombus(Integer diagonal){
        diagonal1 = diagonal;
        diagonal2 = diagonal;
    }

    @Override
    public void getArea(){
        System.out.println((diagonal1 * diagonal2)/2);
    }

}

