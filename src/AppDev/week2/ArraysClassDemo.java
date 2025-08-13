package AppDev.week2;

import java.util.Arrays;

public class ArraysClassDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        // Print the array
        System.out.println("Original: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Search for a number (array must be sorted first!)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Copy the array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // Compare arrays
        System.out.println("Arrays equal? " + Arrays.equals(numbers, copy));

        // Fill the array with a single value
        Arrays.fill(copy, 9);
        System.out.println("Filled copy: " + Arrays.toString(copy));
    }
}
