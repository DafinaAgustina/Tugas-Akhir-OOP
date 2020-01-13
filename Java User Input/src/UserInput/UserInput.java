/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInput;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * 
 */
public class UserInput {
    
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is Dafina: " + userName);  // Output user input
  }
}

