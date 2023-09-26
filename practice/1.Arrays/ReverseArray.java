package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] reverseArray = reverse(array,0,5);
        System.out.println(Arrays.toString(reverseArray));
    }

    // private static int[] reverse(int[] array) {
    // int len = array.length;
    // int[] reverseArray = new int[len];
    // for(int i = len-1; i>=0; i--){
    // reverseArray[len-1-i] = array[i];
    // }
    // return reverseArray;
    // }

    // private static int[] reverse(int[] array){
    // int start = 0;
    // int end= array.length-1;
    // int temp;
    // while(start < end){
    // temp = array[start];
    // array[start] = array[end];
    // array[end] = temp;
    // start++;
    // end--;
    // }
    // return array;
    // }

    // recursive approach
    private static int[] reverse(int[] array, int start, int end) {
        int temp;
        if (start >= end)
            return array;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverse(array, start+1, end-1);
        return array;
    }
}
