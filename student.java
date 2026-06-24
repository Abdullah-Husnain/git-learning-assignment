import java.util.ArrayList;
import java.util.Scanner;

// Class representing a single student
class Student {
    int id;
    String name;
    double marks;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
        marks = 0.0;
    }

    // Parameterized constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display student information
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}

// Main class
public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            // Create Student object and add to list
            Student s = new Student(id, name, marks);
            students.add(s);
        }

        // Display all records
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
