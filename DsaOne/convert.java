package DsaOne;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = sc.nextInt();
        String y = "";
        while (x>0) {
             int rem =x%2;
             x = x/2;
             int result = rem ;
             y = result + y;

}

        System.out.println(y);

}
}
