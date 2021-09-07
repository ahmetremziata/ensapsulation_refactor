package com.ensapsulation_collection_version_1;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private List<Course> courses;

  public Person(String name) {
    this.setName(name);
    this.setCourses(new ArrayList<>());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }
}
