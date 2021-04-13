package com.ivoronline.springboot_dto_json_object_all.dto;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //SETTERS
  private void setName(String  name) { this.name = "Setter " + name; }
  private void setAge (Integer age ) { this.age  = age;              }

  //CONSTRUCTOR
  private PersonDTO(String  name, Integer age) {
    this.name = "Constructor " + name;
    this.age  = age;
  }

}

