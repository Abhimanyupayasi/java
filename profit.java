import java.util.Scanner;
class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();
        if (cp<sp) {
            System.out.print("profit : " );
            System.out.print(sp-cp);
        }

        if(cp>sp)  {
            System.out.print("loss : ");
            System.out.print(cp-sp);



        } 
        if(cp==sp) System.out.println("no profit no loss");   
     }
}

