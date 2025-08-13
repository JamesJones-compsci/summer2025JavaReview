package AppDev.week2;

// Linear Search
// Check each element one by one until you find the target.
// Works on any array, sorted or unsorted.
// Time complexity: O(n)

public class LinearSearchDemo {


    public static void main(String[] args) {
        int[] numbers = {3, 8, 1, 5, 9};
        int target = 5;

        int index = linearSearch(numbers, target);

        if (index == -1) {
            System.out.println(target + " not found.");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return index where key is found
            }
        }
        return -1;  // Not found
    }
}