# Academic Performance Tracker

**Academic Performance Tracker** is a simple Java console application designed to manage and display student details and their academic results. This project demonstrates basic object-oriented programming (OOP) concepts such as inheritance, interfaces, and encapsulation. It allows you to:

- Enter student information (name, roll number, marks).
- Compute a student’s average percentage.
- Display student details and results through a menu-driven interface.

---

### Features

1. **OOP Concepts**  
   - **Inheritance**: The `Result` class extends the `Student` class.  
   - **Interface Implementation**: The `Exam` interface is implemented by the `Result` class, defining the contract for percentage calculation.

2. **Menu-Driven**  
   The main application (`Main.java`) provides a console-based menu allowing users to:
   - Enter new student details.
   - View stored student information.
   - Calculate and display the student’s final result/percentage.
   - Exit the application.

3. **Easy Integration**  
   The code is organized into separate classes (`Student`, `Exam`, `Result`, and `Main`) for clarity. This modular structure makes it easy to integrate or modify individual components.

---

### Project Structure

```
AcademicPerformanceTracker/
├── Exam.java      // Interface defining the contract for calculation
├── Main.java      // Main class containing the menu and program entry point
├── Result.java    // Inherits from Student and implements Exam
└── Student.java   // Base class to store student data
```

- **`Exam.java`**  
  Declares the `Percent_cal()` method that must be implemented to calculate the exam percentage.

- **`Student.java`**  
  Encapsulates student details (name, roll_no, mark1, mark2) with relevant getters and setters.

- **`Result.java`**  
  Inherits from `Student` and implements the `Exam` interface to calculate the student’s percentage.  
  - `Percent_cal()` method computes `(mark1 + mark2) / 2`.  
  - Includes methods to enter student details, display student information, and display results.

- **`Main.java`**  
  Contains the `main` method which drives the console-based menu allowing interaction with the `Result` object.

---

### How to Use

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-username/AcademicPerformanceTracker.git
   ```
2. **Open/Import in Your IDE**  
   - Open your favorite IDE (Eclipse, IntelliJ IDEA, NetBeans, or VS Code).
   - Import the cloned repository as a Java project.

3. **Compile and Run**  
   - Ensure you are in the project’s root directory.
   - Compile the classes:  
     ```bash
     javac *.java
     ```
   - Run the `Main` class:  
     ```bash
     java Main
     ```

4. **Follow the Menu Prompts**  
   - Choose “1” to enter a student’s details (name, roll number, and two marks).  
   - Choose “2” to display the current student’s information.  
   - Choose “3” to display the calculated result (percentage).  
   - Choose “0” to exit the program.

---

### Example

**Sample Interaction:**

```
Menu:
1. Enter Student Details
2. Display Student Information
3. Display Result
0. Exit
Enter your choice: 1
Enter student name: Alice
Enter roll number: 101
Enter mark1: 85
Enter mark2: 90

Menu:
1. Enter Student Details
2. Display Student Information
3. Display Result
0. Exit
Enter your choice: 2
Student [name=Alice, roll_no=101, mark1=85.0, mark2=90.0]

Menu:
1. Enter Student Details
2. Display Student Information
3. Display Result
0. Exit
Enter your choice: 3
Result [percentage=87.5, name=Alice, roll_no=101, mark1=85.0, mark2=90.0]
```

---

### Technologies Used

- **Java** (JDK 8+)
- **Scanner class** for console input

---

### Contributing

Contributions are welcome! If you find a bug or have a feature request, feel free to open an [issue](#) or submit a pull request.

---

### License

This project is licensed under the [MIT License](LICENSE) — feel free to modify and use in your own projects.

---
