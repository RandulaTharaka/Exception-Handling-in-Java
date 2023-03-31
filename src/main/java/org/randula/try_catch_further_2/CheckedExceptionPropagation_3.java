package org.randula.try_catch_further_2;
import java.io.IOException;

//By default, Checked Exceptions are not forwarded in calling chain (propagated). But it can be achieved by declaring throws keyword. look 'n()'
public class CheckedExceptionPropagation_3 {
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws Exception{ // declaring throw keyword, so that caller method 'p()' is expected an Exception from 'n()'
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]){
        CheckedExceptionPropagation_3 obj=new CheckedExceptionPropagation_3();
        obj.p();
        System.out.println("normal flow");
    }
}