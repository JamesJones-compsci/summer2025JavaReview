package AppDev.week1;

public class VariablesConstantsDemo {

    public static void main(String[] args) {
        // Variable declarations
        int age = 25;              // integer variable named 'age'
        double height = 1.75;      // double variable named 'height'
        char grade = 'A';          // character variable named 'grade'
        String name = "Alice";     // String variable named 'name'

        int jamesAge = 47;
        String jamesName = "James";
        double jamesHeight = 1.8;

        char jamesGrade = 'A';

        // int 2manyNum = 35879;

        // Constant declaration using 'final'
        final double PI = 3.14159;

        // Created my own Constant using 'final'
        final double LUCKY_NUM = 131313.1313;

        // Print variables and constants
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Grade: " + grade);
        System.out.println("Constant PI: " + PI);

        System.out.println("User Name: " + jamesName);
        System.out.println("User Age: " + jamesAge);
        System.out.println("User Height: " + jamesHeight + " meters");

        System.out.println("User Grade: " + jamesGrade);
        System.out.println("Lucky Number: " + LUCKY_NUM);


        // Trying to change constant PI (uncommenting below line will cause error)
        // PI = 3.14;
    }
}
