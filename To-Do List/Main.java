import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an instance of ToDoList to manage our tasks
        ToDoList toDoList = new ToDoList();

        // Main loop to keep showing the menu until user exits
        while (true) {
            System.out.println("\n===== To-Do List App =====");
            System.out.println("1. Add a task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Delete a task");
            System.out.println("4. Mark task as done");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            try {
                // Read user input for the menu choice
                int choice = sc.nextInt();
                sc.nextLine(); // clear the leftover newline

                switch (choice) {
                    case 1:
                        // Add a new task
                        System.out.print("Enter a task: ");
                        toDoList.addTask(sc.nextLine());
                        break;

                    case 2:
                        // Show all existing tasks
                        toDoList.showTasks();
                        break;

                    case 3:
                        // Show tasks first so user can see what they're deleting
                        toDoList.showTasks();
                        try {
                            System.out.print("Enter task number to delete: ");
                            int index = sc.nextInt();
                            sc.nextLine(); // clean up the newline character
                            toDoList.deleteTask(index - 1); // convert to 0-based index
                        } catch (InputMismatchException e) {
                            System.out.println("⚠️ Please enter a valid number.");
                            sc.nextLine(); // clear invalid input
                        }
                        break;

                    case 4:
                        // Show tasks before asking user which one to mark as done
                        toDoList.showTasks();
                        try {
                            System.out.print("Enter task number to mark as done: ");
                            int index = sc.nextInt();
                            sc.nextLine();
                            toDoList.markTaskAsDone(index - 1); // adjust for 0-based index
                        } catch (InputMismatchException e) {
                            System.out.println("⚠️ Please enter a valid number.");
                            sc.nextLine(); // clear invalid input
                        }
                        break;

                    case 5:
                        // Exit the application
                        System.out.println("👋 Thanks for using the To-Do App!");
                        return;

                    default:
                        // User entered a number outside the menu options
                        System.out.println("❌ Invalid choice. Please enter a number between 1 and 5.");
                }

            } catch (InputMismatchException e) {
                // User entered something wwrong
                System.out.println("⚠️ Please enter a valid number.");
                sc.nextLine(); // clear invalid input so the loop can continue
            }
        }
    }
}
