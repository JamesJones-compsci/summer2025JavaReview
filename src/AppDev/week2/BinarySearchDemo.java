package AppDev.week2;

// Binary Search
//Works only on sorted arrays.
// Repeatedly divides search interval in half.
// Time complexity: O(log n)

import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9}; // Must be sorted
        int target = 7;

        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
    }
}

