package practice.CollectionInJava.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequePractice {

    public static void main(String[] args) {

        //Reference Video :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=2059s

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // to add element in queue
        arrayDeque.offer(1);
        arrayDeque.offerFirst(4); //to add in first position
        arrayDeque.offerLast(8); //to add in last position
        arrayDeque.offer(5);

        System.out.println(arrayDeque);

        /************************************************************************************/

        // to peek from queue
        System.out.println(arrayDeque.peek()); // it will also peek the first only
        System.out.println(arrayDeque.peekFirst()); // it will peek first element
        System.out.println(arrayDeque.peekLast()); // it will peek the last

        /************************************************************************************/

        // to remove elements from queue
        System.out.println(arrayDeque.poll()); // it will remove the first element
        System.out.println("poll() " +arrayDeque);
        System.out.println(arrayDeque.pollFirst()); // it will remove the first element
        System.out.println("pollFirst() " +arrayDeque);
        System.out.println(arrayDeque.pollLast()); // it will remove the last element
        System.out.println("pollLast() " +arrayDeque);
    }
}
