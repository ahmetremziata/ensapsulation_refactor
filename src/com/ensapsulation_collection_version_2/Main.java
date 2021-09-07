package com.ensapsulation_collection_version_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      Person person = new Person("Ahmet");
      Course course = new Course();
      course.setName("Kurs 1");
      course.setAdvance(true);
      person.addCourse(course);
      Course course2 = new Course();
      course2.setName("Kurs 2");
      course2.setAdvance(false);
      person.addCourse(course2);

      //It does not work!!
      //person.getCourses().get(0).setAdvance(false);

      System.out.println(String.format("numAdvancedCources: %d ", person.getCourses().stream().filter(i -> i.getAdvance()).count()));
    }
}

