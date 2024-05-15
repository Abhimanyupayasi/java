package Leetcode;

import loops.oddNumber;
import pw.somearray;

//136 problem number
public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = new int[]{4,1,2,1,2};
        int res =0;
        for(int i =0; i<arr.length; i++){
            int temp = arr[i];//4
            for(int j =1; j<arr.length; j++){
                if (!(temp == arr[j])) {//4 = 4
                    res = temp;
                    //System.out.println(res);
                   // break;
                }
                //break;
                
            }
            break;
        }
        System.out.println(res);
    }
}
