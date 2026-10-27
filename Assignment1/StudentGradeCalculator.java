public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Store the student's information.
        String studentName = "Chris";
        String major = "Computer Science";
        String course = "CMPS 360";

        // Sample grades 
        double grade1 = 90.0;
        double grade2 = 84.0;
        double grade3 = 96.0;

        // Use floating-point division to calculate the average.
        double average = (grade1 + grade2 + grade3) / 3.0;

        System.out.println("STUDENT INFORMATION AND GRADE REPORT");
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);
        System.out.println("Assignment 1: " + grade1);
        System.out.println("Assignment 2: " + grade2);
        System.out.println("Assignment 3: " + grade3);
        System.out.println("Average: " + average);

        // A student passes when the average is at least 70.
        if (average >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
