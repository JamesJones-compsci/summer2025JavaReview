package AppDev.week2;

import java.util.Arrays;
import java.util.Random;

public class SearchReview {

    public static void main(String[] args) {

        int[] myArray = createUnsortedArray(13);
        int target = 23;

        // Print the unsorted array for clarity
        System.out.println("Unsorted array: " + Arrays.toString(myArray));

        // Linear search
        int index = linearSearch(myArray, target);

        if (index == -1) {
            System.out.println(target + " not found.");
        } else {
            System.out.println(target + " found at index " + index);
        }

        System.out.println("The size of this array is: " + myArray.length);

        // Sort the array
        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Binary search
        int index2 = Arrays.binarySearch(myArray, target);

        if (index2 >= 0) {
            System.out.println(target + " found at index " + index2);
        } else {
            System.out.println(target + " not found.");
        }
    }

    // Creates an unsorted array of integers.
    public static int[] createUnsortedArray ( int size){
        if (size < 0) {
            throw new IllegalArgumentException("Array size cannot be negative.");
        }

        int[] unsortedArray = new int[size];
        Random random = new Random();

        // To better demonstrate, let's randomly decide whether to include the target value 23
        boolean includeTarget = random.nextBoolean();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(50); // Generates a random integer. Smaller range for easier visual check

            // Place target somewhere randomly if needed
            if (includeTarget && i == random.nextInt(size)) {
                unsortedArray[i] = 23;
            }
        }

        return unsortedArray;  // Return the array reference
    }

    // Implements linear search to find a value.
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return index where key is found
            }
        }
        return -1;  // Not found
    }
}
