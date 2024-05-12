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

    public void deleteAt(int index){
        if (index>=this.currentIndex) {
            throw new ExceptionInInitializerError();
            
        }
        for(int i =index; i<=this.currentIndex-2; i++){
            this.items[i] = this.items[i +1];

        }
        
        currentIndex --;
        items[currentIndex] =0;
    }

    public void Reverse(){
        int x = this.currentIndex -1;
        StringBuilder str = new StringBuilder();
        
        for(int i =x; i>=0 ; i--){
            System.out.print(this.items[i]+", ");
            
        }
     
        
    }

    public int Search(int value){
        for(int i =0; i<currentIndex; i++){
            if(this.items[i] == value) return i;

        }
        return -1;
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
