package pw;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        int val = 0;

        int [] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            if (arr[i]>val) val = arr[i];
            
        }
        System.out.println(val);
    }
}
