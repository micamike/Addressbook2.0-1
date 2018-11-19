package com.telran.trello.model;

public class Group {
  private String groupName;
  private String groupHeader;
  private String groupFooter;


  public Group withGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public Group withGroupHeader(String groupHeader) {
    this.groupHeader = groupHeader;
    return this;
  }

  public Group withGroupFooter(String groupFooter) {
    this.groupFooter = groupFooter;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGroupHeader() {
    return groupHeader;
  }

  public String getGroupFooter() {
    return groupFooter;
  }
}
