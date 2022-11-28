package Collections;

import KnightGame.BlackKnight;

import java.util.*;

public class MapExample {
    public static void main(String[] args){
        Map<BlackKnight, String> map = new HashMap<>();

        BlackKnight knight1 = new BlackKnight("maryia");
        BlackKnight knight2 = new BlackKnight("sam");
        BlackKnight knight3 = new BlackKnight("vlad");

        map.put(knight1, knight1.getName());
        map.put(knight2, knight2.getName());
        map.put(knight3, knight3.getName());

        System.out.println(map.containsKey(new BlackKnight("sam")));

//        Integer x = 3;
//        System.out.println(x.compareTo(20));
//
//        Comparator<Integer> integerComparator = Comparator.naturalOrder();
//        System.out.println(integerComparator.compare(3, 2));
//        System.out.println(integerComparator.compare(3, 3));
//        System.out.println(integerComparator.compare(3, 4));
//
//        BlackKnight knight5 = new BlackKnight("maryia");
//        BlackKnight knight6 = new BlackKnight("vlad");
//
//        List<BlackKnight> knights = new ArrayList<>();
//        knights.add(knight5);
//        knights.add(knight6);
//
//        Collections.sort(knights, new Comparator<BlackKnight>(){
//            @Override
//            public int compare(BlackKnight k1, BlackKnight k2){
//                return ((int)k1.getName().charAt(0) - (int)k2.getName().charAt(0));
//            }
//        });
//
//        for(BlackKnight knight: knights){
//            System.out.println(knight.getName());
//        }




    }

    // COMPARATOR ==> compare(objA, objB)
    //                  if value > 0 ==> B, A
    //                  if value < 0 ==> A, B
    // COMPARABLE ==> objA.compareTo(objB)
    //                  if value > 0 ==> B, A;
    //                  if < 0 ==> a, b

    //how many times each name is added

}
