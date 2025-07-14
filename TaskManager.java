import java.util.*;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("✅ Task added successfully.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("⚠️ No tasks found.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getTaskID() == id) return task;
        }
        return null;
    }

    public void updateTask(int id, String name, String dueDate, String priority) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setTaskName(name);
            task.setDueDate(dueDate);
            task.setPriority(priority);
            System.out.println("✅ Task updated successfully.");
        } else {
            System.out.println("❌ Task not found.");
        }
    }

    public void deleteTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("✅ Task deleted.");
        } else {
            System.out.println("❌ Task not found.");
        }
    }
}
