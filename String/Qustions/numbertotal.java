package String.Qustions;

import java.util.Scanner;

public class numbertotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //with inbuilt function
        String s =Integer.toString(n);
        //with logic
        String str = n+"";
        System.out.println(str.length());
        System.out.println(s.length());


    }
}
