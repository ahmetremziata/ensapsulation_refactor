package com.primitive_version_4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Priority {
  private String value;
  private String[] legalValues() {
    return new String[] {"low", "normal", "high", "rush"};
  }

  private Integer getIndex(String priorityValue) {
    Integer len = legalValues().length;
    return IntStream.range(0, len)
        .filter(i -> priorityValue == legalValues()[i])
        .findFirst() // first occurrence
        .orElse(-1);
  }

  public Boolean equals(Priority priority) {
    return getIndex(value) == priority.getIndex(priority.value);
  }

  public Boolean higherThan(Priority priority) {
    return getIndex(value) > priority.getIndex(priority.value);
  }

  public Boolean lowerThan(Priority priority) {
    return getIndex(value) < priority.getIndex(priority.value);
  }

  public Priority(String aValue) {
    Arrays.stream(legalValues()).findFirst();
    boolean contains = Stream.of(legalValues()).anyMatch(x -> x == aValue);
    if (contains) {
      value = aValue;
    } else {
      // error handling
    }
  }

  public String toString() {
    return value;
  }
}
