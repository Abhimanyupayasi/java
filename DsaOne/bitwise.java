package DsaOne;
import DsaOne.bitwiseSecond;
import java.util.Scanner;
// checking the even odd number by bitwise operator
public class bitwise {

    public static void main(String[] args) 
    {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0 ; i<1; i++){
            // Call the method from bitwiseSecond
            if ((11&1) == 0) System.out.println("even");
        else System.out.println("odd"); 
        }
    }}