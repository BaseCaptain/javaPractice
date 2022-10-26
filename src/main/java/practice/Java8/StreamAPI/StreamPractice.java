package practice.Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        // Reference Video :- https://youtu.be/CwOfjXPL6-Q
        /************************************************************************************/

        //to get the even element from list

        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(7);
        list.add(89);
        list.add(8);
        list.add(16);

        System.out.println(list);

        // to filter with using stream
        List<Integer> listWithEven = list.stream().filter(i->i % 2 == 0).collect(Collectors.toList());
        System.out.println(listWithEven);

        List<Integer> listGreaterThan10 = list.stream().filter(i->i > 10).collect(Collectors.toList());
        System.out.println(listGreaterThan10);

        /************************************************************************************/

        //to create blank object of string
        Stream<Integer> stream = list.stream();
        stream.forEach(e-> {
            System.out.println(e);
        });

        // direct way
        list.stream().forEach(e->{
            System.out.println(e);
        });


        /************************************************************************************/

        //different methods in Stream API

        //filter
        List<String> names = new ArrayList<>();
        names.add("Vaibhav");
        names.add("Sayli");
        names.add("Gaurav");
        names.add("Shivani");

        System.out.println(names);

        List<String> v = names.stream().filter(e -> e.startsWith("V")).collect(Collectors.toList());
        System.out.println(v);
        
        //map
        List<Integer> numbers = List.of(34,54,6,75,87,79);

        System.out.println(numbers);

        List<Integer> collect = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

        //sorted
        numbers.stream().sorted().forEach(e-> {
            System.out.println(e);
        });

        //min
        Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(integer);
    }
}
