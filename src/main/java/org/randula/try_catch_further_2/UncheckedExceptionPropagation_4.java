package org.randula.try_catch_further_2;

// default Unchecked Exceptions are forwarded in calling chain (propagated).
public class UncheckedExceptionPropagation_4 {
    void m(){
        int data=50/0;
    }

    void n(){
        m();
    }

    void p() {
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]){
        UncheckedExceptionPropagation_4 obj=new UncheckedExceptionPropagation_4();
        obj.p();
        System.out.println("normal flow...");
    }
}
