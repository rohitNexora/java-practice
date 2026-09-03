import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter DBMS Marks: ");
        int dbms = sc.nextInt();

        System.out.print("Enter Computer Networks Marks: ");
        int cn = sc.nextInt();

        System.out.print("Enter Web Development Marks: ");
        int web = sc.nextInt();

        // Total
        int total = java + dbms + cn + web;

        // Average
        double average = total / 4.0;

        // Highest score
        int highest = Math.max(Math.max(java, dbms),
                        Math.max(cn, web));

        // Lowest score
        int lowest = Math.min(Math.min(java, dbms),
                       Math.min(cn, web));

        // Grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Result
        String result;

        if (average >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Report
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
        System.out.println("Average     : " + average);
        System.out.println("Highest     : " + highest);
        System.out.println("Lowest      : " + lowest);
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);

        System.out.println("==========================================");

        sc.close();
    }
}
