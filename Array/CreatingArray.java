package Array;

public class CreatingArray {
    private int[] items;
    private int currentIndex;

    public CreatingArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex =0;
    }

    public void insert (int value){
        this.items[currentIndex] = value;
        currentIndex++;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int num : this.items){
            str.append(num + ", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

}
