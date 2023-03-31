package org.randula.throws_and_throw_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Checked_Exception {

    public static void validateAge() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\iamra\\Pictures\\MyText.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            validateAge();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("rest of the code...");

    }
}
