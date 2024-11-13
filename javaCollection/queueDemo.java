package javaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();//Queue object of type linked list

        //Push items into the stack
        myQueue.add(1);
        myQueue.add(11);
        myQueue.add(111);
        myQueue.add(1111);
        myQueue.add(11111);
        myQueue.add(111111);
        myQueue.add(1111111);

        System.out.println("The queue size: " + myQueue.size());
        System.out.println("The first element of the queue: " + myQueue.peek());

        while(!myQueue.isEmpty()){//until the stack is not empty, pop and print elements
            System.out.println("Popped Item: "+ myQueue.remove());
        }
    }
}
