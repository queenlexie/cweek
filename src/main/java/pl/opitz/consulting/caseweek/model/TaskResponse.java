package pl.opitz.consulting.caseweek.model;

import java.util.Objects;

public abstract class TaskResponse {

  private Task task;

  public TaskResponse() {
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResponse that = (TaskResponse) o;
    return task == that.task;
  }

  @Override
  public int hashCode() {
    return Objects.hash(task);
  }
}
