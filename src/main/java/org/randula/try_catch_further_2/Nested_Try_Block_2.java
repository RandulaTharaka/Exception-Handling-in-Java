package org.randula.try_catch_further_2;

//Special Case : exception is not handle by the relevant nested catch block, but out block.
public class Nested_Try_Block_2 {
    public static void main(String[] args) {
        // outer (main) try block
        try {
            //inner try block 1
            try {
                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
//            Multiple catch blocks
        }catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
