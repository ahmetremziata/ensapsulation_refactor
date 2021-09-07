package com.ensapsulation_collection_version_2;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private List<Course> courses;

  public Person(String name) {
    this.setName(name);
    this.courses = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //Get copy list
  public  List<Course> getCourses() {
    List<Course> copyCourses = new ArrayList<>();
    for (Course course : courses) {
      Course copyCourse = new Course();
      copyCourse.setAdvance(course.getAdvance());
      copyCourse.setName(course.getName());
      copyCourses.add(copyCourse);
    }
    return copyCourses;
  }

  //Add method for add course
  public void addCourse(Course course) {
    this.courses.add(course);
  }

  //Add method for remove course
  public void removeCourse(Course course) {
    int index = this.courses.indexOf(course);

    if (index == -1) {
      //Error throw exception
    }

    this.courses.remove(index);
  }
}
