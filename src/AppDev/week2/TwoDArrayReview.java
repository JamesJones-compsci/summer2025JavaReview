package AppDev.week2;

import java.util.Arrays;

public class TwoDArrayReview {

    public static void main(String[] args){

        // Stores the marks of 3 students in 4 subjects in a 2D array.
        int[][] marks = new int[][]{
                {65, 79, 73, 89},
                {85, 99, 73, 87},
                {75, 69, 53, 59}
        };

        // Prints the marks in a table format
        System.out.println("Marks Table:");
        print2D(marks);

        // Variable to hold the total marks for the whole class
        int classTotal = 0;
        int numberOfMarks = 0; // total count of all individual marks

        // Calculates and displays the total marks & average for each student.
        for (int row = 0; row < marks.length; row++) {
            int studentTotal = 0; // Reset total for each student

            for (int col = 0; col < marks[row].length; col++) {
                studentTotal += marks[row][col];
                classTotal += marks[row][col]; // add to class total
                numberOfMarks++; // count each mark
            }

            double studentAverage = (double) studentTotal / marks[row].length;
            System.out.println("Student " + (row + 1) + " total: " + studentTotal +
                    ", average: " + studentAverage);
        }

        // Calculate and display the class average
        double classAverage = (double) classTotal / numberOfMarks;
        System.out.println("\nClass total: " + classTotal +
                ", class average: " + classAverage);
    }

    public static void print2D(int[][] marks) {
        // Loop through all rows
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + "\t"); // tab spacing for neatness
            }
            System.out.println(); // new line after each row
        }
    }
}
