package Switch;

public class switchStatement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;

        // method 1: Using Switch Statement

        switch (a > b ? 1 : 0) {
            case 1:
                result = a;
                break;
            case 0:
                result = b;
                break;
            default:
                result = 0;
        }

        System.out.println("greater number is: " + result);


    }
}
