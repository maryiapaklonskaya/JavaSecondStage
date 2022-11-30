package CompareSort;

import KnightGame.BlackKnight;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<BlackKnight, String> map = new HashMap<>();

        BlackKnight knight1 = new BlackKnight("maryia");
        BlackKnight knight2 = new BlackKnight("sam");
        BlackKnight knight3 = new BlackKnight("vlad");

        map.put(knight1, knight1.getName());
        map.put(knight2, knight2.getName());
        map.put(knight3, knight3.getName());

//        System.out.println(map.containsKey(new BlackKnight("sam")));
//
//        Integer x = 3;
//        System.out.println(x.compareTo(20));
//
//        Comparator<Integer> integerComparator = Comparator.naturalOrder();
//        System.out.println(integerComparator.compare(3, 2));
//        System.out.println(integerComparator.compare(3, 3));
//        System.out.println(integerComparator.compare(3, 4));

        BlackKnight knight5 = new BlackKnight("maryia");
        BlackKnight knight6 = new BlackKnight("vlad");

        List<BlackKnight> knights = new ArrayList<>();
        knights.add(knight1);
        knights.add(knight2);
        knights.add(knight3);

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

//        Comparator<BlackKnight> objComparator;
//        System.out.println(StringComparator.compare(knight1, knight2));
//        System.out.println(StringComparator.compare(knight1, knight3));
//        System.out.println(StringComparator.compare(knight2, knight3));

//        Collections.sort(knights, new Comparator<BlackKnight>() {
//            @Override
//            public int compare(BlackKnight k1, BlackKnight k2) {
//                for (int i = 0; i < k1.getName().length(); i++) {
//                    if (((int) k1.getName().toLowerCase().charAt(i) - (int) k2.getName().toLowerCase().charAt(i)) != 0) {
//
//                        System.out.println("names are not the same");
//                        return 1;
//                    }
//                }
//
//                System.out.println(0);
//
//                return 0;
//            }
//
//        });

//        for(BlackKnight knight: knights){
//            System.out.println(knight.getName());
//        }
//
//        System.out.println(knight1.compareTo(knight2));
//
//        Collections.sort(knights);
//        for(BlackKnight knight: knights){
//            System.out.println(knight.getName());
//        }

        //int result = Arrays.binarySearch(new int[], 5);

        Integer[] arr = new Integer[]{1, 5, 3, 8, 2, 6, 0};
        List<Integer> result = Arrays.asList(arr);
        System.out.println(result);

        int[] arr1 = new int[]{1, 5, 3, 8, 2, 6, 0};
        int[] arr2 = new int[]{1, 5, 3, 9, 2, 6, 0};
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.mismatch(arr1, arr2));

        int[] arr11 = new int[]{1, 5, 3, 8, 2, 6, 0};
        int[] arr22 = Arrays.copyOf(arr1, arr1.length /* + 1 */);
        System.out.println(Arrays.toString(arr22));

        int[] arr111 = new int[]{1, 5, 3, 8, 2, 6, 0};
        Arrays.sort(arr111, new Comparator<int>(){
        });
        System.out.println(Arrays.toString(arr22));

        //COLLECTIONS

        List<String> list1 = Collections.emptyList();
        List<String> list2 = Collections.singletonList(); //only 1 element
        List<Integer> list3 = Arrays.asList(new Integer[]{1, 4, 5, 7, 3, 34,1}).emptyList();
        Collections.min(list3);
        Collections.min(list3, Collections.reverseOrder());
        Collections.max(list3);
        Collections.reverseOrder();

        Map<Integer, String> map1 = Collections.emptyMap();
        Map<Integer, String> map2 = Collections.singletonMap();
        Set<Integer> set1 = Collections.emptySet();
        list1.add("add string");










    }
}








//    write a compare method implementation to compare knights by name
//    checking the next character if current characters are equal.
//    should also not be case-sensitive

    // COMPARATOR ==> compare(objA, objB)
    //                  if value > 0 ==> B, A
    //                  if value < 0 ==> A, B
    // COMPARABLE ==> objA.compareTo(objB)
    //                  if value > 0 ==> B, A;
    //                  if < 0 ==> a, b

    //how many times each name is added

