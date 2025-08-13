package AppDev.week1;

public class CharDataDemo {

    public static void main(String[] args) {
        // Declare char variables
        char letter = 'A';
        char digit = '7';
        char symbol = '$';

        char letter2 = 'E';
        char digit2 = '9';

        char c = 90;
        System.out.println("c is: " + c);

        char jamesInit = 'J';

        // Print characters
        System.out.println(" == Characters == ");
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);

        // Character arithmetic: chars can be used as numbers
        char nextLetter = (char) (letter + 1);  // 'B'
        System.out.println("Next letter after " + letter + " is " + nextLetter);

        // Compare characters
        if (jamesInit < 'Z') {
            for (int i = 1; i <= 5; i++) {
                char jamesInitNextLetter = (char) (jamesInit + i);
                System.out.println("The letter that is " + i +
                        (i == 1 ? " letter" : " letters") +
                        " after " + jamesInit + " is " + jamesInitNextLetter);
            }
        }


        // This was all simplified and handled by the above loop
        // if (jamesInit < 'Z') {
        //    char jamesInitNextLetter = (char) (jamesInit + 1);
        //    char jamesInitNextLetter2 = (char) (jamesInit + 2);
        //    char jamesInitNextLetter3 = (char) (jamesInit + 3);
        //    char jamesInitNextLetter4 = (char) (jamesInit + 4);
        //    char jamesInitNextLetter5 = (char) (jamesInit + 5);
        //    System.out.println("Next letter after " + jamesInit + " is " + jamesInitNextLetter);
        //    System.out.println("The letter that is 2 letters after " + jamesInit + " is " + jamesInitNextLetter2);
        //    System.out.println("The letter that is 3 letters after " + jamesInit + " is " + jamesInitNextLetter3);
        //    System.out.println("The letter that is 4 letters after" + jamesInit + " is " + jamesInitNextLetter4);
        //    System.out.println("The letter that is 5 letters after " + jamesInit + " is " + jamesInitNextLetter5);
        //}

        // Compare characters
        if (letter < 'Z') {
            System.out.println(letter + " comes before Z");
        }

        if (letter2 > digit2){
            System.out.println(letter2 + " comes after " + digit2);
        } else {
            System.out.println(digit2 + " comes after " + letter2);
        }

        // Get Unicode value of a char
        int unicodeValue = letter;
        System.out.println("Unicode value of " + letter + " is " + unicodeValue);

        // Unicode value of jamesInit
        int unicodeValue2 = jamesInit;
        System.out.println("Unicode value of " + jamesInit + " is " + unicodeValue2);

        // Use char to check if a letter is uppercase or lowercase by comparing Unicode ranges.
        char checkChar = 'J'; // or any char
        if (checkChar >= 'A' && checkChar <= 'Z') {
            System.out.println(checkChar + " is uppercase.");
        } else if (checkChar >= 'a' && checkChar <= 'z') {
            System.out.println(checkChar + " is lowercase.");
        } else {
            System.out.println(checkChar + " is not a letter.");
        }
    }
}
