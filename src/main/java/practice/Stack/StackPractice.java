package practice.Stack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        //Reference Video :- https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=1152s

        /************************************************************************************/

        Stack<String> myStack = new Stack<>();

        myStack.push("Lion");
        myStack.push("Dog");
        myStack.push("Horse");
        myStack.push("Cat");

        System.out.println("Stack :" + myStack);

        /************************************************************************************/

        // to get the top most element
        System.out.println(myStack.peek());

        /************************************************************************************/

        //to delete element from array that is it will go from top
        myStack.pop();
        //to verify
        System.out.println(myStack.peek());
        System.out.println(myStack);

    }
}
