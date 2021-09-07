package com.extract_class_version_3;

public class Person {
  private String name;
  private String officialAreaCode;
  private String officeNumber;
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

  public String getOfficialAreaCode() {
    return this.telephoneNumber.getAreaCode();
  }

  public void setOfficialAreaCode(String officialAreaCode) {
    this.officialAreaCode = officialAreaCode;
  }

  public String getOfficeNumber() {
    return this.telephoneNumber.getNumber();
  }

  public void setOfficeNumber(String officeNumber) {
    this.officeNumber = officeNumber;
  }

  public String getTelephoneNumber() {
    return this.telephoneNumber.toString();
  }

}
