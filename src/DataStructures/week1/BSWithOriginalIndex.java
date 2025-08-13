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

public class BSWithOriginalIndex {

    // Helper class to store both indices
    static class SearchResult {
        int sortedIndex;
        int originalIndex;

        SearchResult(int sortedIndex, int originalIndex) {
            this.sortedIndex = sortedIndex;
            this.originalIndex = originalIndex;
        }
    }

    // Binary Search with auto-sorting and both indices
    public static SearchResult binarySearchWithBothIndices(int[] arr, int target) {
        // Step 1: Store values with original indices
        int[][] valueIndexPairs = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            valueIndexPairs[i][0] = arr[i]; // value
            valueIndexPairs[i][1] = i;      // original index
        }

        // Step 2: Sort by value
        Arrays.sort(valueIndexPairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Binary search on sorted values
        int left = 0;
        int right = valueIndexPairs.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (valueIndexPairs[mid][0] == target) {
                return new SearchResult(mid, valueIndexPairs[mid][1]); // Both indices
            }
            if (valueIndexPairs[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        int[] data = {25, 17, 39, 42, 23, 4, 16, 8, 15};
        int target = 16;

        SearchResult result = binarySearchWithBothIndices(data, target);

        if (result != null) {
            System.out.println("Binary Search: Found at SORTED index " + result.sortedIndex +
                    " and ORIGINAL index " + result.originalIndex);
        } else {
            System.out.println("Binary Search: Not found");
        }
    }
}
