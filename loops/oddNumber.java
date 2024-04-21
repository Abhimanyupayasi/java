package loops;
import java.util.*;

public class oddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last number that u want : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
