package Array;

public class access {
    public static void main(String[] args) {
        CreatingArray arr = new CreatingArray(20);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        arr.insert(8);
        //System.out.println(arr);
        //System.out.println(arr.Search(4));
        //arr.deleteAt(7);
        arr.Reverse();
        System.out.println(arr);
    }
}
