package student;
public class Student {
    // Instance variables
    private int id;
    private String name;
    private String department;
    private double cgpa;

    // Class variable
    private static String university = "Default University";
    private static int studentCount = 0; // To keep track of the number of students

    // Parameterized constructor
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++; // Increment student count
    }

    // Object method to display student details
    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    // Class method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create three student objects using the parameterized constructor
        Student student1 = new Student(1, "Alice", "Computer Science", 3.9);
        Student student2 = new Student(2, "Bob", "Mathematics", 3.7);
        Student student3 = new Student(3, "Charlie", "Physics", 3.8);

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student3.displayStudentDetails();
        System.out.println();

        // Display total number of students
        Student.displayTotalStudents();
    }
}