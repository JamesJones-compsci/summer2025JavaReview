package AppDev.week2;

import java.util.Arrays;

public class ArrayCopyDemo2 {
    public static void main(String[] args) {

        // Ways to Copy Arrays
        // Independent copy. Changing target won't affect source.

        // Method 1: Manual Copy (Loop)
        int[] source = {10, 20, 30, 40, 50};
        int[] target = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }

        System.out.println("Source[0]: " + source[0]);
        System.out.println("Target[0]: " + target[0]);

        // Method 2: System.arraycopy
        int[] source2 = {10, 20, 30, 40, 50};
        int[] target2 = new int[3]; // Smaller target

        System.arraycopy(source2, 1, target2, 0, 3);
        // Copies 3 elements starting at index 1 of source → target[0..2]

        for (int val : target2) {
            System.out.print(val + " "); // Output: 20 30 40
        }

        // Method 3: Arrays.copyOf and Arrays.copyOfRange
        int[] source3 = {10, 20, 30, 40, 50};

        int[] copy1 = Arrays.copyOf(source3, source3.length);       // Full copy
        int[] copy2 = Arrays.copyOfRange(source3, 1, 4);            // Index 1 to 3

        System.out.println();
        System.out.println(Arrays.toString(copy1)); // [10, 20, 30, 40, 50]
        System.out.println();
        System.out.println(Arrays.toString(copy2)); // [20, 30, 40]

        int[] myArray = {5, 10, 15, 20, 25};

        // Copy only the middle 3 elements (indexes 1, 2, 3)
        int[] copy3 = Arrays.copyOfRange(myArray, 1, 4);

        System.out.println();

        System.out.println("Original array (myArray): " + Arrays.toString(myArray));
        System.out.println("Copied middle 3 (copy3): " + Arrays.toString(copy3));

        System.out.println();

        copy3[2] = 99;

        // Show independence
        System.out.println("\nAfter modifying copy3:");
        System.out.println("Original array (myArray): " + Arrays.toString(myArray));
        System.out.println("Copied middle 3 (copy3): " + Arrays.toString(copy3));



    }
}
