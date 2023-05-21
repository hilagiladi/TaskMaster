import java.util.Date;
import java.util.List;

public class Task {
    private String taskId;
    private String taskName;
    private String taskDescription;
    private int taskPriority;
    private Date taskDeadline;
    private ResourceRequirements resourceRequirements;
    private TaskStatus taskStatus;
    private String taskOwner;
    private List<Task> taskDependencies;
    private TaskResult taskResult;

    // Constructors, getters, and setters

    public Task(String taskId, String taskName, String taskDescription, int taskPriority, Date taskDeadline, ResourceRequirements resourceRequirements, TaskStatus taskStatus, String taskOwner, List<Task> taskDependencies, TaskResult taskResult) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.taskDeadline = taskDeadline;
        this.resourceRequirements = resourceRequirements;
        this.taskStatus = taskStatus;
        this.taskOwner = taskOwner;
        this.taskDependencies = taskDependencies;
        this.taskResult = taskResult;
    }

    public Task(){
        this(null,null,null,0,null,null,null,null,null,null);
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Date getTaskDeadline() {
        if (taskDeadline != null) {
            return new Date(taskDeadline.getTime());
        }
        return null;
    }

    public void setTaskDeadline(Date taskDeadline) {
        if (taskDeadline != null) {
            this.taskDeadline = new Date(taskDeadline.getTime());
        } else {
            this.taskDeadline = null;
        }    }

    public ResourceRequirements getResourceRequirements() {
        return new ResourceRequirements(resourceRequirements);
    }

    public void setResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = new ResourceRequirements(resourceRequirements);
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(String taskOwner) {
        this.taskOwner = taskOwner;
    }

    public List<Task> getTaskDependencies() {
        return taskDependencies;
    }

    public void setTaskDependencies(List<Task> taskDependencies) {
        this.taskDependencies = taskDependencies;
    }

    public TaskResult getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(TaskResult taskResult) {
        this.taskResult = taskResult;
    }
    // Other methods as needed
}
