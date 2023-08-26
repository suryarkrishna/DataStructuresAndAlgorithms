package Arrays;
import java.util.Scanner;

public class AverageTemp {

    private static int findAverage(int[] tempArray) {
        int total = 0;
        for (int i = 0; i < tempArray.length; i++) {
            total += tempArray[i];
        }
        return (total / tempArray.length);
    }

    private static int findNoOfDaysAboveAverage(int avgTemp, int[] tempArray) {
        int count = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] > avgTemp) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days temperature do you want to record? ");
        int noOfDays = sc.nextInt();
        int[] tempArray = new int[noOfDays];
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("Day " + (i + 1) + " 's temperature: ");
            tempArray[i] = sc.nextInt();
        }
        int avgTemp = findAverage(tempArray);
        System.out.println("Average temperature: " + avgTemp);
        System.out.println("Number of days above average temperature: " + findNoOfDaysAboveAverage(avgTemp, tempArray)+ " day(s)");

        sc.close();
    }

}