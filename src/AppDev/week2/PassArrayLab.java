package AppDev.week2;

import java.util.Arrays;

public class PassArrayLab {

    public static void main(String[] args) {
        int[] myArray = {2, 4, 6, 8};

        System.out.println("Original array:");
        printArray(myArray); // Pass to method

        // Pass original array — will be modified
        doubleArray(myArray);
        System.out.println("After doubling original array:");
        printArray(myArray);

        // Pass a copy — original remains unchanged
        doubleArray(Arrays.copyOf(myArray, myArray.length));
        System.out.println("After doubling a copy (original unchanged):");
        printArray(myArray);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // newline
    }

    public static void doubleArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] *= 2; // actually update the array
           // System.out.print(value * 2 + " ");   This will change the value but will not update the array
        }
    }
}
