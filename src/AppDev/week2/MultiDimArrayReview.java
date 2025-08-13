package AppDev.week2;

public class MultiDimArrayReview {

    public static void main(String[] args) {

        int[][][] myCube = new int[2][2][3];

        // Fill the array with sum of indices
        for (int layer = 0; layer < myCube.length; layer++) {
            for (int row = 0; row < myCube[layer].length; row++) {
                for (int col = 0; col < myCube[layer][row].length; col++) {
                    myCube[layer][row][col] = layer + row + col;
                }
            }
        }

        // Print each element with its indices
        for (int layer = 0; layer < myCube.length; layer++) {
            for (int row = 0; row < myCube[layer].length; row++) {
                for (int col = 0; col < myCube[layer][row].length; col++) {
                    System.out.println("Element at [" + layer + "][" + row + "][" + col + "] = " + myCube[layer][row][col]);
                }
            }
        }
    }
}
