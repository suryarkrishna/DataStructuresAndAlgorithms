package Arrays;
import java.util.Arrays;

public class DuplicateNumber {

    public static int[] removeDuplicates(int[] arr) {
        // loop through the Array
        int n = arr.length;
        int uniqueArray[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                uniqueArray[index++] = arr[i];
                System.out.println(index+" "+Arrays.toString(uniqueArray));
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }


    public static void main(String[] args) {
        int[] arr  = new int[]{1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(4^2);
    }
}
