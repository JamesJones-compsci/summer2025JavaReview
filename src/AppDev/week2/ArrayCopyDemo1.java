package AppDev.week2;

public class ArrayCopyDemo1 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] alias = original; // Not a copy, just another reference

        alias[0] = 99; // Changes original too

        System.out.println("Original[0]: " + original[0]); // Prints 99
    }
}
