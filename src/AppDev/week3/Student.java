package AppDev.week3;

// Define a class named student
// This demonstrates "Defining Classes for Objects"

public class Student {

    // Instance variables (also called fields or attributes)
    // These store data unique to each Student object
    private String name;        // The student's name
    private int age;            // The student's age
    private String studentId;   // A unique student ID

    // Static variable (shared by all objects of the class)
    // Demonstrates the difference between instance and static variables
    private static int studentCount = 0; // Tracks number of Student objects created

    // Constructor: special method used to create objects
    // The constructor has the same name as the class
    // It allows us to initialize the instance variables when a Student is created.
    public Student(String name, int age, String studentId) {
        // The 'this' keyword refers to the current object
        // We use it to distinguish between instance variables and parameters
        this.name = name;
        this.age = age;
        this.studentId = studentId;

        // Increment the static studentCount every time a new Student is created
        studentCount++;
    }

    // Getter method for name
    // Demonstrates encapsulation (control access to private fields)
    public String getName(){
        return this.name;   // 'this' is optional here but shows that we're referring to the current object
    }

    // Getter method for age
    public int getAge(){
        return this.age;
    }

    // Getter method for studentId
    public String getStudentId(){
        return this.studentId;
    }

    // Static method to access the static variable studentCount
    // Note: static methods cannot use 'this' because they belong to the class, not an instance
    public static int getStudentCount(){
        return studentCount;
    }

    // Method to display student information
    public void displayInfo(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Id: " + this.studentId);
    }

    // Main method to test creating Student objects
    public static void main(String[] args){

        // Creating Student objects using the constructor
        Student s1 = new Student("Alice", 20, "S1001");
        Student s2 = new Student("Bob", 22, "S1002");


        // Display information of each student
        s1.displayInfo();
        System.out.println();   // Blank line for readability
        s2.displayInfo();

        // Access the static studentCount variable
        System.out.println();
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}
