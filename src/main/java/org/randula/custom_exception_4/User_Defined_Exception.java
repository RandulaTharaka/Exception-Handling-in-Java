package org.randula.custom_exception_4;

public class User_Defined_Exception extends Exception{
    //constructor
    public User_Defined_Exception(String str){
        super(str); //calling constructor of parent Exception
    }
}

class Test2{
    public static void validateAge(int age) throws User_Defined_Exception {
        if(age<18){
            // we are calling our custom exception here 'Throw_User_Defined_Exception_8' instead of Arithmetic or Null Pointer Exception
            throw new User_Defined_Exception("Age is under 18, can not vote!");
        }else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try{
            validateAge(17);
        }catch (User_Defined_Exception e){
            System.out.println(e.getMessage()); // Printing the message from MyException object
        }
    }
}
