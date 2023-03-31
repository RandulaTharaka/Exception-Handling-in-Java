package org.randula.try_catch_basic_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Example to handle checked exception.
public class Checked_Exception {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
