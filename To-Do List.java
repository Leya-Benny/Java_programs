import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> tasks = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice;

        while (true) {
            System.out.println("\n=== My To-Do List ===");
            System.out.println("1. Add Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Remove a Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = reader.readLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter a new task: ");
                    String task = reader.readLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case "2":
                    System.out.println("\n--- Your Tasks ---");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet. Add one!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.print("Enter task number to remove: ");
                    try {
                        int index = Integer.parseInt(reader.readLine()) - 1;
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Oops! That task number doesn't exist.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    System.out.println("Thanks for using the To-Do List. Bye!");
                    return;
                default:
                    System.out.println("Invalid option. Please pick from 1 to 4.");
            }
        }
    }
}
