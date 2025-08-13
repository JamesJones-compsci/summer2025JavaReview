package AppDev.week2;

import java.util.Arrays;

public class ModifyTwoDArrayReview {



    public static void main(String[] args) {

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        replaceEvenWithZero(myArray);

        // Print modified array
        for (int[] row : myArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void replaceEvenWithZero(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                // Find out if the number above is even or odd
                if (matrix[row][col] % 2 == 0) {
                    matrix[row][col] = 0; // modifying original
                }
            }
        }
    }


}
