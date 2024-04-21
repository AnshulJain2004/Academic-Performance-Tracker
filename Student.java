// Student class to represent student information
public class Student {
    // Instance variables to store student data
    String name;
    int roll_no;
    double mark1, mark2;

    // Constructor to initialize Student object with provided values
    public Student(String name, int roll_no, double mark1, double mark2) {
        this.name = name; // Set student name
        this.roll_no = roll_no; // Set roll number
        this.mark1 = mark1; // Set mark1
        this.mark2 = mark2; // Set mark2
    }

    // Getter methods to retrieve the values of instance variables
    public String getName() {
        return name; // Return student name
    }

    public int getRoll_no() {
        return roll_no; // Return roll number
    }

    public double getMark1() {
        return mark1; // Return mark1
    }

    public double getMark2() {
        return mark2; // Return mark2
    }

    // Setter methods to set the values of instance variables
    public void setName(String name) {
        this.name = name; // Set student name
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no; // Set roll number
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1; // Set mark1
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2; // Set mark2
    }

    // Override toString method to provide string representation of Student object
    @Override
    public String toString() {
        return "Student [name=" + name + ", roll_no=" + roll_no + ", mark1=" + mark1 + ", mark2=" + mark2 + "]";
        // Return formatted string with student details
    }
}