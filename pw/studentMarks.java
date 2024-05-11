package pw;

public class studentMarks {
    public static void main(String[] args) {
        
        int []arr  = new int[]{35, 32 , 19 , 80 , 29, 100};
        
        int length = arr.length;
        for(int i = 0; i<length; i++){
            // System.out.println(arr[i]);
            int j = arr[i];
            if (j<=35) {
               System.out.println(i);
            }
        }
    }
    
}
