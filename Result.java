import java.util.Scanner;

// Result class extending Student class and implementing Exam interface
public class Result extends Student implements Exam {
    double percentage; // Variable to store percentage

    // Constructor to initialize Result object with default values
    public Result() {
        super("", 0, 0, 0); // Initialize with empty/default values
    }

    // Method to calculate percentage, implementing the Percent_cal method from the Exam interface
    @Override
    public void Percent_cal() {
        this.percentage = (mark1 + mark2) / 2; // Calculating percentage based on marks
    }

    // Method to enter student details
    public void enterStudentDetails(Scanner scanner) {
        System.out.print("Enter student name: ");
        setName(scanner.next()); // Set student name
        System.out.print("Enter roll number: ");
        setRoll_no(scanner.nextInt()); // Set roll number
        System.out.print("Enter mark1: ");
        setMark1(scanner.nextDouble()); // Set mark1
        System.out.print("Enter mark2: ");
        setMark2(scanner.nextDouble()); // Set mark2
    }

    // Method to display student information
    public String displayStudentInfo() {
        return super.toString(); // Using toString method from Student class to display student info
    }

    // Method to display result
    public String displayResult() {
        Percent_cal(); // Calculate percentage
        return toString(); // Return string representation of result
    }

    // Override toString method to provide string representation of Result object
    @Override
    public String toString() {
        return "Result [percentage=" + percentage + ", name=" + name + ", roll_no=" + roll_no + ", mark1=" + mark1
                + ", mark2=" + mark2 + "]"; // Return formatted string with result details
    }
}