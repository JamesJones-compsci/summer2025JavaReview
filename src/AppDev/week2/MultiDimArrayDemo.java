package AppDev.week2;

public class MultiDimArrayDemo {

    public static void main(String[] args) {
        int[][][] cube = new int[2][3][4];

        // Initialize values
        int value = 1;
        for (int layer = 0; layer < cube.length; layer++) {
            for (int row = 0; row < cube[layer].length; row++) {
                for (int col = 0; col < cube[layer][row].length; col++) {
                    cube[layer][row][col] = value++;
                }
            }
        }

        // Print the cube
        for (int layer = 0; layer < cube.length; layer++) {
            System.out.println("Layer " + layer + ":");
            for (int row = 0; row < cube[layer].length; row++) {
                for (int col = 0; col < cube[layer][row].length; col++) {
                    System.out.print(cube[layer][row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
