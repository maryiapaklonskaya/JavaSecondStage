package Collections;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> myString = new HashSet<>();
        //in the HashSet the order is not kept!!! stores info in hashtable
        myString.add("Sam");

        for(String name: myString){
            if(name.contains("maryia")){
                System.out.println("such name exists");
            }

        }

        TreeSet<String> myString1 = new TreeSet<>();
        //in treeset the order is saved in ABC order (natural order)

        LinkedHashSet<String> myString2 = new LinkedHashSet<>();
        //saves the order in which the info is added



        Set<Integer> example = new HashSet<>();
        System.out.println(example.isEmpty());
        example.add(5);
        example.add(14);

        //option1
        for(Integer num: example){
            System.out.println(num);
        }

        //option2
        example.forEach((Integer num) -> System.out.println(num));

        //option3
        example.forEach(System.out::println);

        Integer[] myIntArray = new Integer[5];

//        void addToArray(int newNum){
//            myIntArray
//            if (contains(x))
//                return;
//            if (size >= capacity) {
//                capacity *= 2;
//                set = Arrays.copyOf(set, capacity);
//            }
//            set[size++] = x;
//        }
//
//        void contains(int num){}





        //// implement a set using an array with any size and create method to add item into array
        //        // make array act like a set

    }


}
