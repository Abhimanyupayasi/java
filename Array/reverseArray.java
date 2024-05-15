package Array;

public class reverseArray {

    public static void main(String[] args) {
        //this is not a good approch 
        int [] arr = new int[]{1,2,3,4,5,6};
        int i =0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

            
        }
        for(int u =0; u<arr.length; u++){
            System.out.println(arr[u]);
        }
    }
}
