package String;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // when we have to input only one word
        String str = sc.next();

        // when we have to input multiple words

        String strr = sc.nextLine();
        
        System.out.println(str);
        System.out.println(strr);
    }
}
