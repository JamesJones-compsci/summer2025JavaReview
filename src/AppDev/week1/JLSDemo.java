// JLSDemo.java

// 1. Package declaration must be the first non-comment statement (JLS §7.4)
package AppDev.week1;

// 2. Import statements follow the package declaration (JLS §7.5)
import java.util.Scanner; // Importing Scanner for user input

/**
 * 3. Public class name must match the file name (JLS §7.6).
 *    Since this file is named JavaLanguageSpecDemo.java, the public class must also be named JavaLanguageSpecDemo.
 */
public class JLSDemo {

    // 4. Entry point: public static void main(String[] args) (JLS §12.1.4)
    public static void main(String[] args) {
        // 5. Variables must be declared before use (JLS §14.4)
        String name;

        // 6. Constants can be declared with final (JLS §4.12.4)
        final String GREETING = "Welcome to the Java Language Specification Demo!";

        // 7. Print the constant (case-sensitive identifiers — JLS §6.2)
        System.out.println(GREETING);

        // 8. Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // 9. Prompt user for their name
        System.out.print("Enter your name: ");
        name = input.nextLine();

        // 10. String concatenation (JLS §15.18.1) to display output
        System.out.println("Hello, " + name + "!");

        // 11. Close the Scanner (JLS encourages resource management — §14.20.3)
        input.close();

        printFarewell();  // Call the new method (printFarewell())
    }

    // New method declaration (JLS §8.4)               # Created a new method
    public static void printFarewell() {
        System.out.println("Goodbye from the Java Language Specification Demo!");
    }
}