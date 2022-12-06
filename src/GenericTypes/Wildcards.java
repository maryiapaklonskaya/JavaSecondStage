package GenericTypes;

import java.util.List;

public class Wildcards {
    public static double sum(final List<? extends Number> numbers){
        double sum = 0;

        for(Number number: numbers){
            sum+=number;
        }
        return sum;

    }

    public static void main(String[] args){
        List<Integer> values = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(sum(values));
    }

    public static void addNumbers(List<? super Integer> list){
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
    }
}
