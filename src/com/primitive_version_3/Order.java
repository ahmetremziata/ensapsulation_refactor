package com.primitive_version_3;

public class Order {
  private Integer orderId;
  private Priority priority;

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Priority getPriority()  {
    return priority;
  }

  public String getPriorityString() {
    return priority.toString();
  }

  public void setPriority(String priority) {
    this.priority = new Priority(priority);
  }
}
