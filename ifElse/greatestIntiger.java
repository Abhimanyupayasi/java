package ifElse;
import java.util.Scanner;
public class greatestIntiger {
    public static void main(String[] args) {
        System.out.print("Enter First Value : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter Second Value : ");
        int y = sc.nextInt();
        System.out.print("Enter Third Value : ");
        int z = sc.nextInt();

        if(x>=y && y>=z){
            System.out.println(x +" is greater");
        }
        if(y>=x && x>=z){
            System.out.println(y +" is greater");
        }
        if(z>=y && y>=x){
            System.out.println(z +" is greater");
        }

        else{
            System.out.println("all the values are same");
        }


    }
}
