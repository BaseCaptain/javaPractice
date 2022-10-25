package practice.CollectionInJava.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

    public static void main(String[] args) {

        //Reference Video :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=1759s

        // this will by default work for min heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        /************************************************************************************/

        // to add element in queue
        priorityQueue.offer(40);
        priorityQueue.offer(12);            // internally min heap function will execute here
        priorityQueue.offer(24);            // the small value will be at the top
        priorityQueue.offer(36);
        System.out.println(priorityQueue);

        /************************************************************************************/

        // to remove the element
        priorityQueue.poll();                   // now it removes the top most element
        System.out.println(priorityQueue);      // and again heap function will execute and bring back the smallest element at the top

        /************************************************************************************/

        // to peek to the queue
        System.out.println(priorityQueue.peek());

        /*****************************************************************************************************************************************************************/

        //to convert the priority queue to max heap we can use comparator
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());
        // to add element in queue
        priorityQueue1.offer(40);
        priorityQueue1.offer(12);            // internally max heap function will execute here
        priorityQueue1.offer(24);            // the big value will be at the top
        priorityQueue1.offer(36);
        System.out.println(priorityQueue1);

    }
}
