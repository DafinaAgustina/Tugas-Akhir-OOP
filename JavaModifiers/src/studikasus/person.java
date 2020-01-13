/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

/**
 *
 * @author LENOVO
 */
abstract class Person {
  public String fname = "Dafina Agustina";
  public int age = 17;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2019;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Semangat untuk menggapai cita-cita");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class myClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
    
}
