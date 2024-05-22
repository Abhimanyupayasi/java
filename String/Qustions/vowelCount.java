package String.Qustions;

import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
        // problem - pw
        // 1. input the sentence 
        // 2. count the vowels 

        // input 
        Scanner sc = new Scanner(System.in);
        int res = 0;
        String vowel = "aeiou";
        int vowellenght = vowel.length();
        System.out.print("Enter Sentence : ");
        String sentence = sc.nextLine();
        int lenght = sentence.length();
        for(int i =0; i<lenght; i++){
            char temp = sentence.charAt(i);
            
            for(int j =0; j<vowellenght; j++){
                if (temp == vowel.charAt(j)) {
                    res++;
                    
                }
            }
            
        }

        System.out.print("The vowels are : "+res);
    }
}
