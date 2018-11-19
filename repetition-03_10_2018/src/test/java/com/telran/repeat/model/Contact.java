package com.telran.repeat.model;

public class Contact {
  private String fName;
  private String lName;
  private String address;
  private String email;
  private String phoneHome;

  @Override
  public String toString() {
    return "Contact{" +
            "fName='" + fName + '\'' +
            ", lName='" + lName + '\'' +
            ", address='" + address + '\'' +
            ", email='" + email + '\'' +
            ", phoneHome='" + phoneHome + '\'' +
            '}';
  }

  public Contact setfName(String fName) {
    this.fName = fName;
    return this;
  }

  public Contact setlName(String lName) {
    this.lName = lName;
    return this;
  }

  public Contact setAddress(String address) {
    this.address = address;
    return this;
  }

  public Contact setEmail(String email) {
    this.email = email;
    return this;
  }

  public Contact setPhoneHome(String phoneHome) {
    this.phoneHome = phoneHome;
    return this;
  }

  public String getfName() {
    return fName;
  }

  public String getlName() {
    return lName;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneHome() {
    return phoneHome;
  }
}
