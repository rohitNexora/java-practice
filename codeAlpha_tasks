import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    // Student class to store individual student information
    static class Student {
        private int rollNo;
        private String name;
        private double marks;

        Student(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public double getMarks() {
            return marks;
        }

        // Calculate grade based on marks
        public String getGrade() {
            if (marks >= 90) {
                return "A+";
            } else if (marks >= 80) {
                return "A";
            } else if (marks >= 70) {
                return "B";
            } else if (marks >= 60) {
                return "C";
            } else if (marks >= 50) {
                return "D";
            } else {
                return "F";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("========================================");
        System.out.println("       STUDENT GRADE TRACKER");
        System.out.println("========================================");

        int numberOfStudents;

        while (true) {
            System.out.print("Enter number of students: ");
            numberOfStudents = sc.nextInt();

            if (numberOfStudents > 0) {
                break;
            }

            System.out.println("Please enter at least 1 student.");
        }

        // Input student data
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\n--- Student " + i + " ---");

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            double marks;
            while (true) {
                System.out.print("Enter Marks (0-100): ");
                marks = sc.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println("Invalid marks! Enter a value between 0 and 100.");
            }

            students.add(new Student(rollNo, name, marks));
        }

        // Calculate average, highest and lowest scores
        double total = 0;
        Student highestStudent = students.get(0);
        Student lowestStudent = students.get(0);

        for (Student student : students) {
            total += student.getMarks();

            if (student.getMarks() > highestStudent.getMarks()) {
                highestStudent = student;
            }

            if (student.getMarks() < lowestStudent.getMarks()) {
                lowestStudent = student;
            }
        }

        double average = total / students.size();

        // Display summary report
        System.out.println("\n\n========================================");
        System.out.println("          SUMMARY REPORT");
        System.out.println("========================================");

        System.out.printf("%-10s %-20s %-10s %-10s%n",
                "Roll No", "Name", "Marks", "Grade");
        System.out.println("----------------------------------------");

        for (Student student : students) {
            System.out.printf("%-10d %-20s %-10.2f %-10s%n",
                    student.getRollNo(),
                    student.getName(),
                    student.getMarks(),
                    student.getGrade());
        }

        System.out.println("----------------------------------------");
        System.out.printf("Average Score : %.2f%n", average);
        System.out.printf("Highest Score : %.2f (%s)%n",
                highestStudent.getMarks(), highestStudent.getName());
        System.out.printf("Lowest Score  : %.2f (%s)%n",
                lowestStudent.getMarks(), lowestStudent.getName());

        System.out.println("========================================");
        System.out.println("Student Grade Tracker completed!");
        System.out.println("========================================");

        sc.close();
    }
}
