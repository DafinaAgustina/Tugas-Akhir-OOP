/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.HashMap;
/**
 *
 * @author LENOVO
 */
public class tampilan {
        public static void main(String[] args){
        //Membuat Objek Dari HashMap
        HashMap<String,String> unpi = new HashMap<>();
        
        //Menginputkan Data pada HashMap
        unpi.put("Nama", "Dafina Agustina");
        unpi.put("Jurusan", "Teknik Informatika");
        unpi.put("Kampus", "Universitas Yudharta Pasuruan");
        
        //Menampilkan Data Sesuai Dengan key yang Di Panggil
        System.out.println(unpi.get("Nama"));
        System.out.println(unpi.get("Jurusan"));
        System.out.println(unpi.get("Kampus"));
    }
}

