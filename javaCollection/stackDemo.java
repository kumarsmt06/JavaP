package javaCollection;

import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();//define stack for integer type

        //push items into the stack
        myStack.push(1);
        myStack.push(11);
        myStack.push(111);
        myStack.push(1111);
        myStack.push(11111);
        myStack.push(111111);
        myStack.push(1111111);

        System.out.println(" The stack size: "+ myStack.size());
        System.out.println(" The top element of the stack: "+ myStack.peek());

        while(!myStack.isEmpty()){//until the stack is not empty, pop and print elements
            System.out.println("Popped Item: "+ myStack.pop());
        }
    }
}
