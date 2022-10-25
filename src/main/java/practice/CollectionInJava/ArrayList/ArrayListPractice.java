package practice.CollectionInJava.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        //Reference Link :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=286s

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Hello");
        System.out.println(arrayList1);

/************************************************************************************/

        //Array List can be implemented from List Interface
        // Here we are adding elements to array
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        System.out.println(arrayList2);

        //creating another list
        List<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(105);
        arrayList3.add(106);
        System.out.println(arrayList3);

        //adding arrayList3 to arrayList2 ( data will append at last only )
        arrayList2.addAll(arrayList3);
        System.out.println(arrayList2);

/************************************************************************************/

        //to get elements from array
        System.out.println(arrayList2.get(5));

/************************************************************************************/

        //to remove element with Index
        arrayList2.remove(2);

        //this will remove that particular value if present
        arrayList2.remove(Integer.valueOf(106));

        //to clear complete list
        //arrayList2.clear();

/************************************************************************************/

        //to set any value from array
        arrayList2.set(1,1000);
        System.out.println(arrayList2);

/************************************************************************************/

        //to Iterate the list
        for (Integer values : arrayList2) {
            System.out.println("elements from for each list " + values);
        }

        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println("Elements from normal for loop list " + arrayList2.get(i));
        }

    }




}
