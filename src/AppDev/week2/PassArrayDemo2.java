package AppDev.week2;

import java.util.Arrays;

// Passing Without Modifying
// If you want to protect the original array:
// Pass a copy instead of the original.

public class PassArrayDemo2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        modifyArray(Arrays.copyOf(numbers, numbers.length));

        System.out.println("Original remains: " + numbers[0]); // Still 1
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 99; // Only changes the copy
    }
}
