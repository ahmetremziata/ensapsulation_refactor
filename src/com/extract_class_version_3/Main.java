package com.extract_class_version_3;

public class Main {

    public static void main(String[] args) {
      TelephoneNumber telephoneNumber = new TelephoneNumber();
      telephoneNumber.setAreaCode("212");
      telephoneNumber.setNumber("555 55 55");
      Person person = new Person(telephoneNumber);
      person.setName("Bim");
      System.out.println(String.format("Office: %s Telephonenumber is:%s ", person.getName(), person.getTelephoneNumber()));
    }
}

