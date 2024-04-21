package ternaryOperator;

public class ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;

        // method 1: Using Ternary Operator

        result = (a>b)?a : b;
        System.out.println("greater number is: " + result  );

         // method 2: Using Ternary Operator

         System.out.println("greater number is: " + ((a>b)?a : b)  );



        //Using if-else
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        System.out.println("greater number is = " + result);
    }
}
