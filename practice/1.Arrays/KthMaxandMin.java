import java.util.Arrays;

public class KthMaxandMin {
    //kth maximum 
    static int kthMax(int k, int[] array) {
        Arrays.sort(array);
        return array[array.length - k];

    }
    //
    static int kthMin(int k,int[] array) {
        Arrays.sort(array);
        return array[k-1];
        
    }


    public static void main(String[] args) {
        int[] array = new int[]{7, 10, 4, 3, 20, 15};
        System.out.println(kthMin(3, array));
        kthMax(3, array);
    }
}