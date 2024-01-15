package com.mad.easyrules.model;

import lombok.Data;

/** The type Person. */
@Data
public class Person {
  private String name;
  private int age;
  private String discount;
  private boolean isSenior;

  /**
   * Instantiates a new Person.
   *
   * @param name the name
   * @param age the age
   */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
