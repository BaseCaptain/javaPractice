package practice.CollectionInJava.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        //Reference video :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=3183s

        /************************************************************************************/

        Map<String, Integer> map = new HashMap<>();

        //to add elements into hashmap
        map.put("one",1);
        map.put("two",2);
        map.put("four",4);
        System.out.println(map);

        /************************************************************************************/

        // to put the element if not available in map
        map.putIfAbsent("two",5);
        System.out.println(map);

        /************************************************************************************/

        //to iterate through map
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            //to print full entry
            System.out.println(e);

            //to print only keys
            System.out.println(e.getKey());
            //to print values
            System.out.println(e.getValue());
        }

        /************************************************************************************/

        //to get only keys
        for (String keys : map.keySet()) {
            System.out.println(keys);
        }

        // to get only values
        for (Integer values : map.values()) {
            System.out.println(values);
        }

        /************************************************************************************/
    }
}
