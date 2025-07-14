public class Task {
    private int taskID;
    private String taskName;
    private String dueDate;
    private String priority;

    public Task(int taskID, String taskName, String dueDate, String priority) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public int getTaskID() { return taskID; }
    public void setTaskID(int taskID) { this.taskID = taskID; }

    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    @Override
    public String toString() {
        return "ID: " + taskID + ", Name: " + taskName + ", Due: " + dueDate + ", Priority: " + priority;
    }
}
