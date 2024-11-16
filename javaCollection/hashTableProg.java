package javaCollection;

import java.util.Hashtable;

public class hashTableProg {
    public static void main(String[] args) {
        Hashtable<String, Integer> stHash = new Hashtable<>();

        stHash.put("sumit", 34);
        stHash.put("sumit1", 14);
        stHash.put("sumit2", 42);
        stHash.put("sumit3", 34);
        stHash.put("sumit4", 44);
        stHash.put("sumit5", 54);

        System.out.println("The student hash table: \n" + stHash + "\n\n");

        String maxKey = "";
        int maxMark = 0;
        for(String key: stHash.keySet()){
            if(maxMark < stHash.get(key)){
                maxKey = key;
                maxMark = stHash.get(key);
            }
        }
        System.out.println("The Student " + maxKey + " got highest marks, marks: " + maxMark);
    }
}
