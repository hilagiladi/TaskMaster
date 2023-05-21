import java.util.*;

public class TaskScheduler {

    public static List<Task> scheduleTasks(List<Task> tasks) {
        Queue<Task> queue = new LinkedList<>();
        Set<Task> visited = new HashSet<>();

        for (Task task : tasks) {
            scheduleTaskWithDependencies(task, queue, visited);
        }

        return new ArrayList<>(queue);
    }

    private static void scheduleTaskWithDependencies(Task task, Queue<Task> queue, Set<Task> visited) {
        if (visited.contains(task)) {
            return;
        }

        visited.add(task);

        for (Task dependency : task.getTaskDependencies()) {
            scheduleTaskWithDependencies(dependency, queue, visited);
        }

        queue.add(task);
    }

    // Rest of the code (main method, Task class, etc.)
}
