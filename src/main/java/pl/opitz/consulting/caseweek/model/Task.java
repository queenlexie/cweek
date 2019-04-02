package pl.opitz.consulting.caseweek.model;
package com.amazonaws.codesamples;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

public enum Task {

  LAMBDA_DEPLOYED, RECTANGLE_FIELD, PALINDROME, TRANSLATE, PRIME_NUMBER
}
public class DynamoDBMapperCRUDE {

    static DynamoDB client = DynamoDB.standard().build();

    @Override
    public void saveTask(Task task, String reult) {
        // Save the item (book).
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        Result result = new Result();
        result.setResult(result);
        result.setTask(task.name());
        mapper.save(result);
    }

    @Override
    public void updateTask(Task task, String reult) {
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        Result result = mapper.load(Result.class, task.name());
        result.setResult(result);
        mapper.save(result);
    }

}

      @DynamoDBTable(tableName = "Result")
      public class Result {

          private String task;
          private String result;

          @DynamoDBHashKey(attributeName = "task")
          public String getTask() {
              return task;
          }

          public void setTask(String task) {
              this.task = task;
          }

          @DynamoDBAttribute(attributeName = "result")
          public String getResult() {
              return result;
          }

          public void setResult(String result) {
              this.result = result;
          }

          @Override
          public String toString() {
              return "Book [Result=" + field + palindrome + primary + translatedText "]";
          }
      }
