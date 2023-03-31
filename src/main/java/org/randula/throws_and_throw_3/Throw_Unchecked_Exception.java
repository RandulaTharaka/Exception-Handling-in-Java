package org.randula.throws_and_throw_3;

public class Throw_Unchecked_Exception {

    public static void validateAge(int age) throws ArithmeticException{
        if(age<18){
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        try{
            validateAge(13);
        }catch(ArithmeticException e){
//            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
