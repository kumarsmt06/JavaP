package vectors;

import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> numVector = new Vector<>();

        numVector.add(1);
        numVector.add(2);
        numVector.add(3);
        numVector.add(4);
        numVector.add(5);

        System.out.println("The size of the vector: " + numVector.size());

        //display the content of the vector
        for(Integer num: numVector){
            System.out.print(num + " ");
        }

        //insert another number at the index 3 in numVector
        numVector.add(2,199);

        System.out.println();
        System.out.println("Numbers: " + numVector);
    }
}
