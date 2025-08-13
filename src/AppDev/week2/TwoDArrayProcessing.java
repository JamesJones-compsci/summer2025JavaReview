package AppDev.week2;

public class TwoDArrayProcessing {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
            }
        }

        System.out.println("Total sum: " + sum);
    }
}
