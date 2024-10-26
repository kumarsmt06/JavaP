package arrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //create array list for string type object
        ArrayList<String> cityList = new ArrayList<>();

        //adding items in the array list
        cityList.add("Gaya");
        cityList.add("Patna");
        cityList.add("Kanpur");
        cityList.add("Delhi");

        System.out.println("The size of the array list: " + cityList.size());

        //display the content of the array list
        System.out.println("Cities: " + cityList);
        
        //display the content of the array list one by one
        for(String city: cityList){
            System.out.println(city);
        }

        //insert
        cityList.add(3,"Ranchi");

        System.out.println("Cities: "+ cityList);

    }
}
