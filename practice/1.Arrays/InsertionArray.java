package Arrays;
import java.util.Arrays;

public class InsertionArray {

    int[] array = null;

    public InsertionArray(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int pos, int val) {
        try {
            if(array[pos] == Integer.MIN_VALUE){
                    array[pos] = val;
                    System.out.println("Successfully inserted");
            }
            else{
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        InsertionArray arr = new InsertionArray(3);
        arr.insert(0, 2);
        arr.printArray();
    }

}
