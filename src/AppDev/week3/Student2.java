package AppDev.week3;

// Class representing a Student with enhanced features
public class Student2 {

    // --- Visibility Modifiers ---
    // Private: accessible only within this class
    private String name;
    private int age;

    // Protected: accessible within this class, subclasses, and same package
    protected String studentId;

    // Public: accessible from anywhere
    public String major;

    // --- Static Variables and Constants ---
    // Static variable: shared among all Student objects
    private static int studentCount = 0;

    // Constant: final means it cannot be changed after initialization
    public static final String SCHOOL_NAME = "George Brown College";

    // Constructor
    public Student2(String name, int age, String studentId, String major) {
        this.name = name;           // 'this' refers to current object
        this.age = age;
        this.studentId = studentId;
        this.major = major;

        studentCount++;             // Increment static count for every new object
    }

    // Static Method: can access only static variables/methods
    // Demonstrates how we can get the total number of students without creating an object
    public static int getStudentCount() {
        return studentCount;
    }

    // Method to display student information
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("StudentId: " + this.studentId);
        System.out.println("Major: " + this.major);
        System.out.println("School: " + SCHOOL_NAME);       // Using a constant
    }

    // --- Passing Objects to Methods ---
    // Method that accepts another Student object
    // Demonstrates that we can pass objects as parameters
    public void compareAge(Student2 other){
        if(this.age > other.age){
            System.out.println(this.name + " is older than " + other.name + "!");
        } else if(this.age < other.age){
            System.out.println(this.name + " is younger than " + other.name + "!");
        } else {
            System.out.println(this.name + " and " + other.name + " are the same age");
        }
    }


    // Main method to test the new features
    public static void main(String[] args) {

        // Creating Student objects
        Student2 s1 = new Student2("James", 47, "S1001", "Computer Science");
        Student2 s2 = new Student2("Amanda", 38, "S1002", "Learning and Development");
        Student2 s3 = new Student2("Chris", 22, "S1003", "Modern Art");

        // Display student info
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
        System.out.println();

        // Access static variable through static method
        System.out.println("Total students enrolled: " + Student2.getStudentCount());
        System.out.println();

        // Passing objects to a method
        s1.compareAge(s2);
        s2.compareAge(s3);
        System.out.println();

        System.out.println(s1.name + " has " + s1.major + " as their major");


    }


}
