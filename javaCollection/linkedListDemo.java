package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(1);
        intList.add(11);
        intList.add(111);
        intList.add(1111);
        intList.add(11111);
        intList.add(111111);
        intList.add(1111111);

        System.out.println("The linked list size: "+ intList.size() + "\ncontent:" + intList + "\n");
        
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int item : array){
            arrList.add(item);
        }
        System.out.println("The array list size: "+ arrList.size() + "\ncontent:" + arrList + "\n");
        
        
        intList.addAll(2,arrList);
        System.out.println("The linked list size: "+ intList.size() + "\ncontent:" + intList + "\n");



    }
}
