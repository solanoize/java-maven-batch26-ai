package com.juaracoding.testing;

/**
 * Karena kita mendefinisikan properti nama dan usia di kelas Person,
 * properti tersebut akan tersedia "di semua objek kelas Person".
 */
class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
