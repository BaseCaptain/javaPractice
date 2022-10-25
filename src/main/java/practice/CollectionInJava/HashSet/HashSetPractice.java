package practice.CollectionInJava.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {

        //Reference Video :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=2343s

        /************************************************************************************/

        Set<Integer> hashSet = new HashSet<>();

        //to add elements
        hashSet.add(3);
        hashSet.add(64);  // it won't add duplicate element, sent will be unique always
        hashSet.add(87);  // internally it will perform hash operation
        hashSet.add(12);

        System.out.println(hashSet);

        /************************************************************************************/

        //to remove the elements
        hashSet.remove(3);
        System.out.println(hashSet);

        /************************************************************************************/

        // to check weather the data present in hashset or not
        System.out.println(hashSet.contains(87)); // it will return boolean

        /************************************************************************************/

        // to check weather the set is empty or not
        System.out.println(hashSet.isEmpty());

        /************************************************************************************/

        // to clear the set
        hashSet.clear();

    }
}
