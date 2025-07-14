import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n📋 Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Due Date (YYYY-MM-DD): ");
                    String dueDate = scanner.nextLine();
                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    manager.addTask(new Task(id, name, dueDate, priority));
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter Task ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New Task Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("New Due Date: ");
                    String newDate = scanner.nextLine();
                    System.out.print("New Priority: ");
                    String newPriority = scanner.nextLine();
                    manager.updateTask(updateId, newName, newDate, newPriority);
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("👋 Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
