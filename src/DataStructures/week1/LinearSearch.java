package DataStructures.week1;

// Linear Search
// Concept:
// Works on any array (sorted or unsorted).
// Scans each element one-by-one until the target is found or array ends.
// Time Complexity:
// Best Case: O(1) (target found at first position)
// Worst Case: O(n) (target at end or not found)
// Space Complexity: O(1) (no extra data structures)

public class LinearSearch {

    // Linear Search method
    public static int linearSearch(int[] arr, int target) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {  // i goes from 0 to last index
            // Check if current element matches target
            if (arr[i] == target) {
                return i; // Return index where found
            }
        }
        // If loop ends, target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {42, 23, 4, 16, 8, 15};
        int target = 16;

        int result = linearSearch(data, target);

        if (result != -1) {
            System.out.println("Linear Search: Found at index " + result);
        } else {
            System.out.println("Linear Search: Not found");
        }
    }
}
