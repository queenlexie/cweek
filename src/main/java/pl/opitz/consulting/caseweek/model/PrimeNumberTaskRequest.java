package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskRequest extends TaskRequest {

    private Integer number;

    public PrimeNumberTaskRequest() {
        this.task = Task.PRIME_NUMBER;
    }

    public PrimeNumberTaskRequest(Integer number) {
        this();
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
