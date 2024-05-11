package DsaOne;

public class binaryToDecimal {
    public static void main(String[] args) {
        String res = "";
        int n = 10;
        while (n != 0) {
            int lastBit = n&1;
           res = lastBit + res;
           n =n>>1;
        }

        System.out.println(res);
    }
}
