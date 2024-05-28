package String.Qustions;

public class updateEven {
    public static void main(String[] args) {
        String str = "kalu hai";
        String res = "";
        for(int i =0; i<str.length(); i++){
            if (i%2 == 0) {
                res= res +'a';

            }
            else res = res + str.charAt(i);
        }
        System.out.println(res);

    }
}
