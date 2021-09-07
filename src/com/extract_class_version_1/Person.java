package com.extract_class_version_1;

public class Person {
  private String name;
  private String officialAreaCode;
  private String officeNumber;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOfficialAreaCode() {
    return officialAreaCode;
  }

  public void setOfficialAreaCode(String officialAreaCode) {
    this.officialAreaCode = officialAreaCode;
  }

  public String getOfficeNumber() {
    return officeNumber;
  }

  public void setOfficeNumber(String officeNumber) {
    this.officeNumber = officeNumber;
  }

  public String getTelephoneNumber() {
    return String.format("%s %s",this.officialAreaCode,this.officeNumber);
  }
}
