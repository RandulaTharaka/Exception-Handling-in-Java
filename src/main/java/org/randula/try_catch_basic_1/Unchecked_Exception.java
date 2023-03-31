package org.randula.try_catch_basic_1;

public class Unchecked_Exception {
    public static void main(String[] args) {
        try{
            int data = 50/0; // may throw an exception(error) is enclosed by try block so the rest of the code works
            System.out.println("Rest of the code 1"); // if exception occurred in previous line, rest of the code in try block doesn't get executed.
        }catch (ArithmeticException e){ // can use 'Exception e' (not best practice) | if we use 'ArrayIndexOutOfBoundsException' throws an exception and stop program
            System.out.println(e); // printing the error
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Can not divided by zero"); //custom message
            System.out.println("Rest of the code 2"); // rest of the code get executed
//            int data2=50/0; //may throw exception. exception code should go into try block
        } finally { // finally method should come right after the catch block.
            System.out.println("Finally block is always executed whether exception is handled or not");
        }
        System.out.println("Rest of the code 3"); // rest of the code get executed
    }
}