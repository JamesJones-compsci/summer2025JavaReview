package DataStructures.week1;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 40; // Increased n to better show timing differences

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);  // initialize memo array with -1 (means not computed)

        // Measure time for Top-Down Recursive (without memoization)
        long start = System.nanoTime();
        int resultTopDown = fibTopDown(n);
        long end = System.nanoTime();
        long durationTopDown = end - start;

        // Measure time for Bottom-Up Iterative
        start = System.nanoTime();
        int resultBottomUp = fibBottomUp(n);
        end = System.nanoTime();
        long durationBottomUp = end - start;

        // Measure time for Memoized Recursive
        start = System.nanoTime();
        int resultMemo = fibMemo(n, memo);
        end = System.nanoTime();
        long durationMemo = end - start;

        System.out.println("Fibonacci (Top-Down Recursive) of " + n + " = " + resultTopDown +
                " (Time: " + durationTopDown / 1_000_000.0 + " ms)");

        System.out.println("Fibonacci (Bottom-Up Iterative) of " + n + " = " + resultBottomUp +
                " (Time: " + durationBottomUp / 1_000_000.0 + " ms)");

        System.out.println("Fibonacci (Memoized) of " + n + " = " + resultMemo +
                " (Time: " + durationMemo / 1_000_000.0 + " ms)");
    }

    // Top-Down Recursive Fibonacci (without memoization)
    public static int fibTopDown(int n) {
        if (n <= 1) {
            return n; // base cases: fib(0)=0, fib(1)=1
        }
        return fibTopDown(n - 1) + fibTopDown(n - 2);
    }

    // Bottom-Up Fibonacci (Iterative)
    public static int fibBottomUp(int n) {
        if (n <= 1) return n;

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    // Memoized Fibonacci:
    // Memoization stores intermediate results to avoid repeated computation in recursive calls.
    public static int fibMemo(int n, int[] memo) {
        if (n <= 1) return n;  // base case

        if (memo[n] != -1) {   // if already computed, return cached value
            return memo[n];
        }

        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);  // store result

        return memo[n];
    }

}
