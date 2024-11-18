package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null; //Initially fileReader points to null
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("sample.txt");
            fileOut = new FileOutputStream("sampleCopy.txt");

            int c;
            while ((c = fileIn.read()) != -1) { 
                fileOut.write((char) c); //write all the character one by one from sample.txt
            }

            System.out.println(" Writing of sampleCopy.txt is completed");
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file-name"+e);
        } finally {
            if(fileIn !=null){
                fileIn.close();
            }
            if(fileOut !=null){
                fileOut.close();
            }
        }
    }
}
