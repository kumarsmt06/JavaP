package javaCollection;

import java.util.HashMap;

public class hashmapProg {
    public static void main(String[] args) {
        HashMap<Integer, String> schoolHash = new HashMap<Integer, String>();

        schoolHash.put(13, "Teacher");
        schoolHash.put(14, "Student");
        schoolHash.put(10, "Principle");
        schoolHash.put(17, "Director");
        schoolHash.put(25, "Guard");
        schoolHash.put(8, "Class");

        System.out.println("The school hash map: \n" + schoolHash + "\n\n");

        if(schoolHash.containsKey(10)){
            System.out.println("The people in school is " + schoolHash.get(10));
        } else {
            System.out.println("The key is not found");
        }
    }
}
