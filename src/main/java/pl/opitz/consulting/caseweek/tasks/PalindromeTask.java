package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.PalindromeTaskRequest;
import pl.opitz.consulting.caseweek.model.PalindromeTaskResponse;

public class PalindromeTask implements Task<PalindromeTaskRequest, PalindromeTaskResponse> {

  @Override
  public PalindromeTaskResponse resolveTask(PalindromeTaskRequest request) {
    return new PalindromeTaskResponse(checkPalindrom(request.getWord()));
  }

  private Boolean checkPalindrom(String word) {
    word = word.toLowerCase();
    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) != word.charAt(word.length() - i - 1))
        return false;
    }
    return true;
  }
}
