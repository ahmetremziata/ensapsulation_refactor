package com.extract_class_version_1;

public class Main {

    public static void main(String[] args) {
      Person person = new Person();
      person.setName("Bim");
      person.setOfficialAreaCode("212");
      person.setOfficeNumber("555 55 55");
      System.out.println(String.format("Office: %s Telephonenumber is:%s ", person.getName(), person.getTelephoneNumber()));
    }
}

