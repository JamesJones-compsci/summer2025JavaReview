package DataStructures.week1;

// Insertion Sort
//Concept:
//Builds the sorted array one element at a time by inserting each new element
// into its correct place among already sorted elements.
// Good for small or nearly sorted data sets.
// Time Complexity:
// Best Case: O(n) (already sorted)
// Worst Case: O(n²) (reverse order)
// Space Complexity: O(1) — in-place

public class InsertionSort {


    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from second element (index 1) because single element is trivially sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to insert
            int j = i - 1;     // Start comparing with previous element

            // Shift elements of sorted segment that are greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Move element one step right
                j--;                  // Move left in array
            }

            // Insert the key into its correct location
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] insertionData = {22, 27, 16, 18, 6, 11, 20};
        insertionSort(insertionData);
        System.out.print("Insertion Sort result: ");
        for (int num : insertionData) {
            System.out.print(num + " ");
        }
    }
}