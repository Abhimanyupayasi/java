package ifElse;

import java.util.Scanner;

public class nestedGreater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1st value : ");
        int a = sc.nextInt();
        System.out.print("enter 2st value : ");
        int b = sc.nextInt();
        System.out.print("enter 3st value : ");
        int c = sc.nextInt();

        if (a>=b) {
            if (a>=c) {
                System.out.println(a + " is greater");
            }
            else System.out.println(c + " is greater");
            
        }
       else if (b>=a) {
            if (b>=c) {
                System.out.println(b + " is greater");
            }
            else System.out.println(c + " is greater");
            
        }
       
    }
}
