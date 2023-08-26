import java.util.Arrays;

public class ArrayCreation {

    static int[][] rotateMatrix(int[][] matrix) {
        // rotating a matrix by 90 deg makes row to columns
        //last row becomes first column and first row become last column
        int rows = matrix.length-1;
        int[][] newMatrix = new int[rows+1][rows+1];
        
        for(int i = 0; i <= rows ; i++){
            for(int j = 0 ; j <= rows ; j++){
                newMatrix[i][j] = matrix[rows - j][i];
            }
        }
        System.out.println(Arrays.deepToString(newMatrix));
        return newMatrix;
    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        rotateMatrix(array);
    }
}
