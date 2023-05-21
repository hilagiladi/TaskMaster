import java.util.Date;

public class TaskValidator {

    public static boolean validateTask(Task task) {
        if (task.getTaskId() == null || task.getTaskId().isEmpty()) {
            System.out.println("Task ID is required.");
            return false;
        }

        if (task.getTaskName() == null || task.getTaskName().isEmpty()) {
            System.out.println("Task name is required.");
            return false;
        }

        if (task.getTaskDescription() == null || task.getTaskDescription().isEmpty()) {
            System.out.println("Task description is required.");
            return false;
        }

        if (task.getTaskPriority() < 0) {
            System.out.println("Invalid task priority.");
            return false;
        }

        if (task.getTaskDeadline() != null && task.getTaskDeadline().before(new Date())) {
            System.out.println("Task deadline cannot be in the past.");
            return false;
        }

        if (task.getResourceRequirements() == null) {
            System.out.println("Resource requirements are missing.");
            return false;
        }

        if (task.getTaskStatus() == null) {
            System.out.println("Task status is required.");
            return false;
        }

        if (task.getTaskOwner() == null || task.getTaskOwner().isEmpty()) {
            System.out.println("Task owner is required.");
            return false;
        }

        if (task.getTaskDependencies() == null) {
            System.out.println("Task dependencies are missing.");
            return false;
        }

        if (task.getTaskResult() == null) {
            System.out.println("Task result is missing.");
            return false;
        }

        // Additional validations for specific fields

        if (task.getResourceRequirements().getMemoryGB() <= 0) {
            System.out.println("Invalid memory value for resource requirements.");
            return false;
        }

        if (task.getTaskDependencies().contains(task)) {
            System.out.println("Task cannot depend on itself.");
            return false;
        }

        return true;
    }
}
