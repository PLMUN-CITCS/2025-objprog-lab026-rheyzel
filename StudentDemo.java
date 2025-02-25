// Student class definition
class Student {
    // Private instance variables for name, id, and GPA
    private String name;
    private int id;
    private double gpa;

    // Static variable to count the total number of students
    private static int studentCount = 0;

    // Constructor to initialize the student's name, id, and GPA, and increment the student count
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++; // Increment student count each time a new student is created
    }

    // Instance method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students created
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Calling the instance method to display each student's information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Calling the static method to display the total number of students created
        Student.displayStudentCount();
    }
}
