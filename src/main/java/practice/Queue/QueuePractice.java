package practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        /************************************************************************************/

        // to add element in queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        /************************************************************************************/

        //to delete the value from queue
        System.out.println(queue.poll());

        /************************************************************************************/

        //to see which element is next in line
        System.out.println(queue.peek());

    }

}
