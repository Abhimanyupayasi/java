package String.Qustions;

import java.util.Scanner;

public class vowelWithFunction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = 0;
        for(int i =0; i<str.length(); i++){
            if (isVowel(str.charAt(i)) == true) {
                res++;
                
            }
        }
        System.out.println(res);
         
    }
    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
        return false;
    }
}
