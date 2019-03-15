package pl.opitz.consulting.caseweek.model;

public class PalindromeTaskRequest extends TaskRequest {

  private String word;

  public PalindromeTaskRequest() {
    this.task = Task.PALINDROME;
  }

  public PalindromeTaskRequest(String word) {
    this();
    this.word = word;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
