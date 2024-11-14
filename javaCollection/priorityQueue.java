package javaCollection;

import java.util.Iterator;
import java.util.PriorityQueue;


class Student implements Comparable<Student>{
    private int rank;
    private String name;
    public Student(String name, int rank){
        this.rank= rank;
        this.name= name;
    }
    @Override
    public int compareTo(Student st){
        if(rank < st.rank)
            return -1;
        else if(rank > st.rank)
            return 1;
        return 0;
    }
    @Override
    public String toString(){
        String result = "Student name: " + name + ", rank: " + rank;
        return result;
    }
}
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> studentQ = new PriorityQueue<>();

        studentQ.add(new Student("Sumit", 5));
        studentQ.add(new Student("Kusum", 3));
        studentQ.add(new Student("Shital", 4));
        studentQ.add(new Student("Dolly", 2));
        studentQ.add(new Student("Pankaj", 1));

        System.out.println("Size of the queue: " + studentQ.size());

        Iterator<Student> it = studentQ.iterator();
        while(it.hasNext()){
            System.out.println("The item of the queue: " + studentQ.poll().toString());
        }
    }
}
