package AppDev.week2;

// Example: Modifying an Array in a Method

public class PassArrayDemo1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        modifyArray(numbers); // Passes reference

        System.out.println("After method call: " + numbers[0]); // Prints 99
        // *** Key takeaway: Changing arr[0] inside the method changes numbers[0] in main.
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 99; // Changes original array
    }
}
