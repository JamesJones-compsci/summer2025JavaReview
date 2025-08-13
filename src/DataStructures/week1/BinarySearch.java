package DataStructures.week1;

// Binary Search
// Works only on sorted arrays.
// Repeatedly halves the search space by comparing middle element to target.
// Time Complexity:
// Best Case: O(1) (middle element is target)
// Worst Case: O(log n) (each comparison halves search space)
// Space Complexity:
// Iterative version: O(1)
// Recursive version: O(log n) due to call stack

import java.util.Arrays;

public class BinarySearch {

    // Binary Search (Iterative version) with auto-sorting
    public static int binarySearch(int[] arr, int target) {

        Arrays.sort(arr); // 🔹 Always sort before searching

        int left = 0;                 // starting index
        int right = arr.length - 1;   // ending index

        while (left <= right) {       // search space is valid
            int mid = left + (right - left) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid; // Found the target
            }
            if (arr[mid] < target) {
                left = mid + 1; // Ignore left half
            } else {
                right = mid - 1; // Ignore right half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] data = {25, 17, 39, 42, 23, 4, 16, 8, 15};
        int target = 16;

        int result = binarySearch(data, target);

        if (result != -1) {
            System.out.println("Binary Search: Found at index " + result);
        } else {
            System.out.println("Binary Search: Not found");
        }
    }
}




