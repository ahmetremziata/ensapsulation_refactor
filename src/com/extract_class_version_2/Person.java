package com.extract_class_version_2;

public class Person {
  private String name;
  private TelephoneNumber telephoneNumber;

  public Person(TelephoneNumber telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTelephoneNumber() {
    return this.telephoneNumber.getTelephoneNumber();
  }

}
