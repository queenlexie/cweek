package pl.opitz.consulting.caseweek.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.amazonaws.services.lambda.model.InvocationType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.log4j.Logger;
import pl.opitz.consulting.caseweek.model.*;
import pl.opitz.consulting.caseweek.tasks.*;

public class Lambda {

  private static final Logger LOG = Logger.getLogger(Lambda.class);

  private RectangleTask rectangleTask;
  private PalindromeTask palindromeTask;

  public Lambda() {
    this.rectangleTask = TaskFactory.instance().createRecentagleTask();
    this.palindromeTask = TaskFactory.instance().createPalindromeTask();
  }

  @LambdaFunction(invocationType = InvocationType.RequestResponse)
  public TaskResponse getRequestAndReturnResponse(LambdaRequest request) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    LOG.debug(objectMapper.writeValueAsString(request));

    switch (request.getTask()) {
      case RECTANGLE_FIELD:
        return rectangleTask.resolveTask(
            objectMapper.readValue(request.getRequestAsJson(), RectangleTaskRequest.class));
      case PALINDROME:
        return null;
      default:
        return null;
    }
  }

}
