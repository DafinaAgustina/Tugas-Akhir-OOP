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
public class exceptions {
     public static void main (String[] args ){
        String a[] = new String[10];       
        try{
            System.out.println(a[-1]);   
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Anda mengakses array pada indeks yang salah");
        }
        catch(Exception e)
        {
            System.out.println("maaf saya salah mengaksesnya");      
        }
    }
}
