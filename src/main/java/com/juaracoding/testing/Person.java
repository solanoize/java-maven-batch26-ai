package com.juaracoding.testing;

/**
 * Karena kita mendefinisikan properti nama dan usia di kelas Person,
 * properti tersebut akan tersedia "di semua objek kelas Person".
 */
class Person {
  String name;
  int age;

  void sayHi() {
    /**
     * Perilaku (method) mewakili tindakan yang
     * dapat dilakukan objek (invoke - dipanggil)
     * untuk memanipulasi datanya (dia bisa ubah data atau manggil datanya).
     */
    System.out.println("Nama saya adalah " + name);
  }
}
