package String.methods;

public class charAt {
    public static void main(String[] args) {
        // string is the collection of char 
        //it can
        String s = "abhimanyu";
       System.out.println(s.charAt(0));
        // loop to show all the char of String;

        for(int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        // print with the index
        for(int i = 0; i<s.length(); i++){
            System.out.println( i +" "+ s.charAt(i));
        }

        // here we are learn about length property;
    }
}
