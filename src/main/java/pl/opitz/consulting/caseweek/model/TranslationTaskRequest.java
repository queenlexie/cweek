package pl.opitz.consulting.caseweek.model;

public class TranslationTaskRequest extends TaskRequest {

  private String sentence;

  public TranslationTaskRequest() {
    this.task = Task.TRANSLATE;
  }

  public TranslationTaskRequest(String sentence) {
    this();
    this.sentence = sentence;
  }

  public String getSentence() {
    return sentence;
  }

}
