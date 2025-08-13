package AppDev.week2;

public class ArrayBasicsDemo {
    public static void main(String[] args) {
        // Declare and create an array of size 5
        int[] numbers = new int[5];
        int[] numbers2 = new int[7];

        // Assign values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Assign values to numbers2
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        numbers2[5] = 6;
        numbers2[6] = 7;

        // This reversed the array in place instead of just printing it in reverse.
        // Swap elements from start to end
        for (int i = 0; i < numbers2.length / 2; i++) {
            int t = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = t;
        }

        // This actually prints the array in reverse order. (Returns array to its original order)
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }


        // Calculates and prints the average of the numbers.
        int sum2 = 0;
        // int avgSum2 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            sum2 += numbers2[i];
            // Perform the calculation outside the loop
            // avgSum2 = sum2 / numbers2.length;
        }
        double avgSum2 = (double) sum2 / numbers2.length;
        System.out.println("Average of sum2: " + avgSum2);

        // Print all elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Sum all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // Access a specific element
        System.out.println("Element at index 2: " + numbers[2]);
    }
}
