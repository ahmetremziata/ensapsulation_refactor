package com.extract_class_version_3;

public class TelephoneNumber {
  private String areaCode;
  private String number;

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String toString() {
    return String.format("%s %s",this.areaCode,this.number);
  }

}
