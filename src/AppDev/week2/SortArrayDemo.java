package AppDev.week2;

import java.util.Arrays;
import java.util.Random;

public class SortArrayDemo {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object

        int[] randNumArray = new int[10];
        for (int i = 0; i < randNumArray.length; i++) {
            randNumArray[i] = rd.nextInt(50); // storing random integers in an array
        }

        System.out.println(Arrays.toString(randNumArray));   // Outside of the loop so that it only prints once
        // Prints the unsorted array
        // You’re printing each element in the for loop:
        // System.out.println(randNumArray[i]); // printing each array element.
        // This works, but note — it prints one number per line.

        // Sort the array
        Arrays.sort(randNumArray);
        System.out.println(" === This is the sorted array === ");
        System.out.println(Arrays.toString(randNumArray));


        // Find and print the minimum and maximum values from the sorted array.
        // This is perfectly fine — though since the array is sorted, we could also just do:
        // int min = randNumArray[0];
        // int max = randNumArray[randNumArray.length - 1];
        // which would be faster because no extra streaming is needed.
        int min = Arrays.stream(randNumArray).min().getAsInt();
        int max = Arrays.stream(randNumArray).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
