/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classAtribute;

/**
 *
 * @author LENOVO
 */
public class person {
    String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    person myObj = new person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}

