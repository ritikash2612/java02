package com.springbootapp.webapp.restfulwebservices;

import javax.validation.constraints.Size;
import java.util.Date;

public class User {
  private Integer id;
  @Size(min = 3, message =  "Name should have at least 2 characters")
  private String name;
  private Date birthDate;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  public User() {
  }

  public User(Integer id, String name, Date birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", birthDate=" + birthDate +
        '}';
  }
}
