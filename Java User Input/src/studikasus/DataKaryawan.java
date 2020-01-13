/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DataKaryawan {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, gaji;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT.surya ###");
        System.out.println("Nama karyawan: ");
        System.out.println("Alamat: ");
        System.out.println("Usia: ");
        System.out.println("Gaji:");
        
        
        
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        nama = keyboard.nextLine();
        System.out.println("Nama Karyawan: " + nama);
        alamat = keyboard.nextLine();
        System.out.println("Alamat: " + alamat);
        usia = keyboard.nextInt();
        System.out.println("Usia: " + usia + " tahun");
        gaji = keyboard.nextInt();
        System.out.println("Gaji: Rp " + gaji);
    }
}
