package AppDev.week2;

public class ModifyTwoDArray {

    public static void increaseAll(int[][] matrix, int value) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] += value; // modifying original
            }
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2},
                {3, 4}
        };

        increaseAll(data, 10); // pass array to method

        // Check if original is modified
        // enhanced for loop (also called a “for-each” loop).
        System.out.println(" == Enhanced for loop == ");
        for (int[] row : data) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Regular indexed for loop
        System.out.println("\n == Regular indexed for loop == ");
        for (int row = 0; row < data.length; row++) { // Go through each row index
            for (int col = 0; col < data[row].length; col++) { // Go through each column index
                System.out.print(data[row][col] + " "); // Access via explicit indexes
            }
            System.out.println(); // Newline after each row
        }
    }
}
