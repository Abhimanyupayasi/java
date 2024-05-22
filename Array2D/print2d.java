package Array2D;

import java.util.Scanner;

public class print2d {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter colum number : ");
        int row = sc.nextInt();
        System.out.print("Enter row number : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for(int i=0; i<row; i++ ){
            for(int j =0; j<col; j++){
                int temp = arr[i][j];
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        
    }
}
