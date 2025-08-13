package DataStructures.week1;

// Recursion Basics
// Recursion is a programming technique where a method calls itself to solve smaller sub-problems of the original problem.
//It’s useful for problems that can be broken down into similar smaller problems.
//
// Base Case & Recursive Step:
// Base Case: Stops the recursion — the simplest problem that can be solved directly without further recursive calls.
// Recursive Step: The function calls itself with a smaller/simpler input, gradually approaching the base case.

public class RecursionBasics {

    // Recursive method to calculate factorial
    // If n == 0, stop and return 1 (base case).
    // Otherwise, multiply n by factorial of n-1 (recursive step).
    // Recursion keeps calling itself with decreasing n until base case is reached.
    public static int factorial(int n) {
        if (n == 0) {  // Base case: factorial of 0 is 1
            return 1;
        } else {
            // Recursive step: n * factorial of (n-1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println(num + "! = " + result);
    }
}
