import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        // Subject marks
        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter DBMS Marks: ");
        int dbms = sc.nextInt();

        System.out.print("Enter Computer Networks Marks: ");
        int cn = sc.nextInt();

        System.out.print("Enter Web Development Marks: ");
        int web = sc.nextInt();

        // Calculate total
        int total = java + dbms + cn + web;

        // Calculate percentage
        double percentage = total / 4.0;

        // Grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } 
        else if (percentage >= 80) {
            grade = 'B';
        } 
        else if (percentage >= 70) {
            grade = 'C';
        } 
        else if (percentage >= 60) {
            grade = 'D';
        } 
        else if (percentage >= 50) {
            grade = 'E';
        } 
        else {
            grade = 'F';
        }

        // Result
        String result;

        if (percentage >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Display student report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);

        System.out.println("------------------------------------------");

        System.out.println("Java                : " + java);
        System.out.println("DBMS                : " + dbms);
        System.out.println("Computer Networks   : " + cn);
        System.out.println("Web Development     : " + web);

        System.out.println("------------------------------------------");

        System.out.println("Total Marks : " + total + "/400");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);

        System.out.println("==========================================");

        sc.close();
    }
}