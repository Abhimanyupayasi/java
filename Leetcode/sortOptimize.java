package Leetcode;

public class sortOptimize {
    public static void main(String[] args) {
        int [] arr = new int[]{2,0,1};
        int i =0;
        int j =0;
        int k = arr.length-1;
        
        for(int x=0; x<=k; x++){
            if (arr[j] ==1) {
                
                j++;
            }
            if (arr[j]==0) {
                int tamp = arr[j];
                arr[j] = arr[i];
                arr[i] = tamp;
               // j++;
                i++;
            }
            if (arr[j]==2) {
                int tamp = arr[j];
                arr[j] = arr[k];
                arr[k] =tamp;
               k--;
              // j--; 
            }
        }
    
    
    

    for(int n : arr){
    System.out.println(n);
    }
}
}
