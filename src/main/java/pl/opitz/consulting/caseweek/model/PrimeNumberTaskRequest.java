package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskRequest extends TaskRequest {

    private Task task;
    private Integer number;

    public PrimeNumberTaskRequest() {
        setTask(Task.PRIME_NUMBER);
    }

    public PrimeNumberTaskRequest(Task task, Integer number) {
        this();
        this.task = task;
        this.number = number;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
