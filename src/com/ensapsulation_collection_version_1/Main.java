package com.ensapsulation_collection_version_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      Person person = new Person("Ahmet");
      List<Course> courses = new ArrayList<>();
      Course course = new Course();
      course.setName("Kurs 1");
      course.setAdvance(true);
      courses.add(course);
      Course course2 = new Course();
      course2.setName("Kurs 2");
      course2.setAdvance(false);
      courses.add(course2);
      person.setCourses(courses);

      /*Course course3 = new Course();
      course3.setName("Kurs 3");
      course3.setAdvance(true);

      person.getCourses().add(course3);*/

      System.out.println(String.format("numAdvancedCources: %d ", person.getCourses().stream().filter(i -> i.getAdvance()).count()));
    }
}

