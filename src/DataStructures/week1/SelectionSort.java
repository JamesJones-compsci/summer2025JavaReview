package DataStructures.week1;

public class SelectionSort {

    // Selection sort method
    public static void SelectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the smallest element is at position i
            int minIndex = i;
            // Find the smallest element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // update index of new smallest
                }
            }

            // Swap the found smallest with the element at position i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Main method to run your code
    public static void main(String[] args) {
        int[] selectionData = {29, 10, 14, 37, 13};
        SelectionSort(selectionData);

        System.out.print("Selection Sort result: ");
        for (int num : selectionData) {
            System.out.print(num + " ");
        }
    }
}


