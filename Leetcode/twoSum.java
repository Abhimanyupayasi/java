package Leetcode;
public class twoSum {
    public static void main(String[] args) {
        int [] arr  = new int[]{3,3};
        int target = 6;
        for(int i = 0; i<arr.length; i++){
            int tamp = arr[i];//3
            for(int j =0; j<arr.length; j++){
                int tampSum = tamp + arr[j];
                if(i != j){
                    if (tampSum == target) {
                        System.out.println("[" + i + "," + j +"]");
                        break;
                    }
                } 
                
                //break;
                
            }
            //break;
        }
        
    }
}
