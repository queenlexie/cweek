package pl.opitz.consulting.caseweek.model;

public class TranslationTaskResponse extends TaskResponse {

  private String sentence;

  public TranslationTaskResponse() {
    this.setTask(Task.TRANSLATE);
  }

  public TranslationTaskResponse(String sentence) {
    this();
    this.sentence = sentence;
  }


  public String getSentence() {
    return sentence;
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }
}
