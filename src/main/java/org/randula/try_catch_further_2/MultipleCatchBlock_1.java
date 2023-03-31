package org.randula.try_catch_further_2;

public class MultipleCatchBlock_1 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0; // calculation of '30/0' is executed first before assigning it. so Arithmetic error comes first.
            System.out.println(a[5]); // this line doesn't get executed because error occurred in previous line.
        }catch (ArrayIndexOutOfBoundsException e){ // this line won't be executed| only one exception is being checked at a time
            System.out.println(e);
        }catch(ArithmeticException e){ // this will be executed
            System.out.println(e);
        }catch (Exception e){ // ordered from most specific to most general.
            System.out.println(e);
        }
        System.out.println("Rest of the code"); // get executed
    }
}
