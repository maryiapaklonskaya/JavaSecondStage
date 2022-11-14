package Shapes;

public class Parallelogram extends iParallelogram {


        public Parallelogram(Integer length, Integer height){
            this.length = length;
            this.height = height;
        }

        @Override
        public void getArea(){
            System.out.println(length * height);
        }

    }
