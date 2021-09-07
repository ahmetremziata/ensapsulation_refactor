package com.extract_class_version_2;

public class TelephoneNumber {
  private String officialAreaCode;
  private String officeNumber;

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
