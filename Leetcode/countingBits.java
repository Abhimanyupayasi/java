package Leetcode;

public class countingBits {
    public static void main(String[] args) {

        int n = 2;
        int arr[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            arr[i] = 0;
            while (i != 0) {
                int lastBit = i & 1;
                if (lastBit == 1)
                    arr[i]++;
    
                i = i >> 1;
            }
        }
        for (int i = 0; i<= arr.length; i++){
            System.out.println(arr[i]);
        }
       


            
        
    }
}
