/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author LENOVO
 */

    class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // membuat sebuah objek car
Car myCar = new Car();

    // Panggil metode Honk () (dari kelas kendaraan) pada objek mobil akseshalamanprofil
   myCar.honk();

    // Menampilkan nilai dari atribut merek (dari kelas kendaraan) dan nilai modelName dari kelas mobil
 System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

