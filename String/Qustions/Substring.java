package String.Qustions;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        //question - pw
        //1.input
        //2.print all substring of the string
        //input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        for(int i =0; i<length; i++){
            for(int j = i+1; j<=length; j++){
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}
