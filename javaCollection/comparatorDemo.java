package javaCollection;

import java.util.ArrayList;
import java.util.Comparator;

class stringCompare implements Comparator<String>{
    @Override
    public int compare(String str1, String str2){
        return str1.compareTo(str2);
    }
}

public class comparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Patna");
        cityList.add("Gaya");
        cityList.add("Kanpur");
        cityList.add("Delhi");
        cityList.add("Lucknow");
        cityList.add("Darbhanga");

        System.out.println("Cities unsorted: " + cityList);
        
        cityList.sort(new stringCompare());
        
        System.out.println("Cities sorted: " + cityList);
    }
}
