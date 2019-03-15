package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskResponse extends TaskResponse {

  private Boolean primeNumber;

  public PrimeNumberTaskResponse() {
    this.setTask(Task.PRIME_NUMBER);
  }

  public PrimeNumberTaskResponse(Boolean primeNumber) {
    this();
    this.primeNumber = primeNumber;
  }

  public Boolean getPrimeNumber() {
    return primeNumber;
  }

  public void setPrimeNumber(Boolean primeNumber) {
    this.primeNumber = primeNumber;
  }
}
