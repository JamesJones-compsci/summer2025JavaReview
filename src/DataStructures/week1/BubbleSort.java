package DataStructures.week1;

// Concept:
//Repeatedly compares adjacent elements and swaps them if they’re in the wrong order.
//After each pass, the largest remaining element “bubbles up” to the correct position.
//Time Complexity:
//Best Case: O(n) if array is already sorted (with early exit optimization)
//Worst Case: O(n²) if array is in reverse order
//Space Complexity: O(1) — in-place sort

public class BubbleSort {

    public static void main(String[] args) {
        int[] bubbleData = {42, 23, 4, 16, 8, 15};
        bubbleSort(bubbleData);
        System.out.print("Bubble Sort result: ");
        for (int num : bubbleData) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



        public static void bubbleSort(int[] arr) {
        int n = arr.length; // store length for efficiency

        // Outer loop runs n-1 times (after n-1 passes, array is sorted)
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // flag to track if any swap happens in a pass

            // Inner loop: compares each adjacent pair
            // After i passes, last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // if left element is bigger than right
                    // Swap them
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // a swap occurred
                }
            }

            // If no swaps occurred, array is already sorted → break early
            if (!swapped) {
                break;
            }
        }
    }
}
