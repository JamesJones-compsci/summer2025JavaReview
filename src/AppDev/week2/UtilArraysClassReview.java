package AppDev.week2;

import java.util.Arrays;

public class UtilArraysClassReview {

    public static void main(String[] args) {

        // Create an integer array with the values {10, 20, 30, 40, 50}
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(myArray));

        // Make a copy of the first three elements.
        int[] copyArray = Arrays.copyOf(myArray, 3);
        System.out.println("Copied array: " + Arrays.toString(copyArray));

        // Fills the copied array with the number 99.
        Arrays.fill(copyArray, 99);
        System.out.println("Filled copy (99): " + Arrays.toString(copyArray));

        // Checks if the original and copied arrays are equal.
        System.out.println("Arrays equal? " + Arrays.equals(myArray, copyArray));
    }

}
