package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskResponse extends TaskResponse {

    private Task task;
    private Boolean primeNumber;

    public PrimeNumberTaskResponse() {
        setTask(Task.PRIME_NUMBER);
    }

    public PrimeNumberTaskResponse(Task task, Boolean primeNumber) {
        this();
        this.task = task;
        this.primeNumber = primeNumber;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Boolean getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(Boolean primeNumber) {
        this.primeNumber = primeNumber;
    }
}
