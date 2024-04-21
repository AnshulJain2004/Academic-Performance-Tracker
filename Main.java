import java.util.Scanner;

// Main class to run the program
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        Result res = new Result(); // Create an empty Result object to store student details and results

        int choice;
        // Menu-driven loop to allow user interaction until they choose to exit
        do {
            // Displaying the menu options
            System.out.println("Menu:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Information");
            System.out.println("3. Display Result");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's choice
            choice = scanner.nextInt();

            // Switch case to handle different menu options
            switch (choice) {
                case 1:
                    res.enterStudentDetails(scanner); // Call method to enter student details
                    break;
                case 2:
                    System.out.println(res.displayStudentInfo()); // Display student information
                    break;
                case 3:
                    System.out.println(res.displayResult()); // Display result
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!"); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option."); // Handle invalid input
                    break;
            }
        } while (choice != 0); // Repeat until user chooses to exit

        scanner.close(); // Close the Scanner object to prevent resource leak
    }
}