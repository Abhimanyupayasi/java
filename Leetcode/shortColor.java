package Leetcode;



public class shortColor {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        int[] newArr = new int[arr.length];
        int  i = 0 ,j =0, k =0; 
        for(int x =0; x<arr.length; x++){
            if (arr[x] == 0) {
                i++;
            }
            if (arr[x] == 1) {
                j++;
            }
            if (arr[x] == 2) {
                k++;
            }
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        for(int a =0; a<i; a++){
            newArr[a] = 0;
            
        }
        for(int a =i; a<i+j; a++){
            newArr[a] = 1;
            
        }
        for(int a =i+j; a<i+j+k; a++){
            newArr[a] = 2;
            
        }
        for(int n : newArr){
            System.out.println(n);
        }

    }}