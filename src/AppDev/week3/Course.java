package AppDev.week3;

// Immutable class to represent a Course
// Once a Course object is created, its details cannot be changed ('final' keyword)
final class Course {

    private final String courseName;
    private final String courseCode;

    // Constructor for immutable object
    public Course(String courseName, String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Getters only - no setters, ensures immutability
    public String getCourseName(){
        return courseName;
    }

    public String getCourseCode(){
        return courseCode;
    }
}


// Student class for Array of Objects example
class Student3{

    private String name;
    private int age;
    private String studentId;
    private Course enrolledCourse;      // Composition - Student HAS-A Course

    // Static count of all students created
    private static int studentCount;

    // Constructor
    public Student3(String name, int age, String studentId, Course enrolledCourse){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.enrolledCourse = enrolledCourse;
        studentCount++;
    }

    // Display student info
    public void displayInfo(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nStudentId: " + studentId +
                "\nEnrolledCourse: " + enrolledCourse.getCourseName() + " (" +
                enrolledCourse.getCourseCode() + ")");
    }

    public static int getStudentCount(){
        return studentCount;
    }

    // Demonstrates variable scope
    public void scopeExample(){
        String localVariable = "I exist only inside scopeExample()";    // Local variable
        System.out.println("LocalVariable: " + localVariable);
        System.out.println("Student's name inside scopeExample: " + name);  // Can access instance example
    }


    // Main method
    public static void main(String[] args){

        // --- Array of Objects ---
        // Create immutable Course objects
        Course course1 = new Course("Computer Science", "CS101");
        Course course2 = new Course("Mathematics", "MATH201");

        // Create an array to store multiple Student objects
        Student3[] students = new Student3[3];

        // Fill array with Student objects
        students[0] = new Student3("James", 47, "S1001", course1);
        students[1] = new Student3("Amanda", 39, "S1002", course2);
        students[2] = new Student3("Matthew", 42, "S1003", course1);

        // Loop through array and display each student's info
        for (Student3 s : students){
            s.displayInfo();
            System.out.println();
        }

        // Display total student count (static data)
        System.out.println("\nTotal students: " + studentCount);
        System.out.println();

        // Demonstrating variable scope
        students[0].scopeExample();
        // The following line will cause an error because localVariable is not visible here:
        // System.out.println(localVariable);
    }
}