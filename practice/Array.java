import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for a second, I forgot how to take array as input
        System.out.println("Enter the numbers of elements you want to store: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i< n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: "+ Arrays.toString(array));
    }
}
