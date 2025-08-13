package AppDev.week1;

public class NumericDataDemo {

    public static void main(String[] args) {
        // Integer variables
        int x = 20;
        int y = 3;
        int z = 5;

        // Floating-point variables
        double a = 5.5;
        double b = 2.0;

        // Long variables
        long c = 536789654782563L;
        long d = 67894578962L;

        // Float variables
        float f1 = 3.5f;
        float f2 = 2.0f;
        float floatSum = f1 + f2;

        // Arithmetic operations with integers
        int sum = x + y;             // Addition
        int diff = x - y;            // Subtraction
        int product = x * y;         // Multiplication
        int quotient = x / y;        // Division (integer division)
        int remainder = x % y;       // Modulus (remainder)

        // Average of 3 integers
        int intAvg = (x + y + z) / 3;

        // Arithmetic operations with doubles
        double doubleSum = a + b;
        double doubleDiv = a / b;

        // This should cause an error
        //int errorNum = x + y / 0;
        // double errorNum2 = a + b / 0;

        // Output results
        System.out.println("Integer operations:");
        System.out.println("x + y = " + sum);
        System.out.println("x - y = " + diff);
        System.out.println("x * y = " + product);
        System.out.println("x / y = " + quotient + " (integer division)");
        System.out.println("x % y = " + remainder + " (modulus)");

        System.out.println("\nFloating-point operations:");
        System.out.println("a + b = " + doubleSum);
        System.out.println("a / b = " + doubleDiv);

        System.out.println("\nLong Variables:");
        System.out.println("\nLong Variable 1: " + c);
        System.out.println("\nLong Variable 2: " + d);

        System.out.println("\nAverage of 3 Integers: " + intAvg);

        System.out.println("Float sum: " + floatSum);

        // System.out.println("\nMeant to cause an error: " + errorNum);
        // System.out.println("\nMeant to cause a second error: " + errorNum2);


    }
}
