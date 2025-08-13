package DataStructures.week1;

import java.util.Random; // Added for generating random numbers

public class MergeSort {

    public static void main(String[] args) {

        // Adjustable test array size and max random value
        int size = 100_000; // Number of elements to generate
        int maxValue = 1_000_000; // Maximum possible random value

        // Generate a random array for testing performance
        // This replaces the small hardcoded array in your original code.
        int[] arr = generateRandomArray(size, maxValue);

        // Start timing before sorting
        long startTime = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime(); // End timing after sorting

        // Print only the first 20 sorted elements to verify correctness
        // Printing the entire sorted array would be overwhelming for large sizes.
        System.out.print("First 20 sorted elements: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calculate and print time taken in milliseconds
        double durationInMillis = (endTime - startTime) / 1_000_000.0;
        System.out.printf("%nTime taken to sort %d elements: %.3f milliseconds%n", size, durationInMillis);
    }

    // Helper method to generate a random integer array
    // - size: number of elements
    // - maxValue: maximum random value
    public static int[] generateRandomArray(int size, int maxValue) {
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(maxValue + 1); // Values from 0 to maxValue inclusive
        }
        return result;
    }

    // MergeSort Method
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // Base case: more than one element
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);      // Sort left half
            mergeSort(arr, mid + 1, right); // Sort right half

            merge(arr, left, mid, right);   // Merge sorted halves
        }
    }

    // Merge Method
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}
