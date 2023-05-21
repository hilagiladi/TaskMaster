import java.util.List;
import java.util.Map;

public class TaskResult {
    private boolean success;
    private String errorMessage;
    private Object resultData;
    private Map<String, String> metrics;
    private List<String> logs;
    private String outputFile;

    public TaskResult(boolean success, String errorMessage, Object resultData, Map<String, String> metrics,
                      List<String> logs, String outputFile) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.resultData = resultData;
        this.metrics = metrics;
        this.logs = logs;
        this.outputFile = outputFile;
    }

    // Getters and Setters

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public Map<String, String> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, String> metrics) {
        this.metrics = metrics;
    }

    public List<String> getLogs() {
        return logs;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }
}
