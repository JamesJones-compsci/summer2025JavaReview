package AppDev.week2;

// Example: Passing for Processing Only
// Sometimes, you don’t want to change anything — you just want to read data.
// Arrays can be passed for read-only use (though Java doesn’t enforce immutability here).

public class PassArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78};

        printArray(scores); // Pass to method
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
