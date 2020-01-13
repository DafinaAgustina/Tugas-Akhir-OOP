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
public class myclass {
    public static String nama = "Dafina Agustina";

	public static String getNama(){
		return nama;
	}

	public static int hitungUmur(int lahir, int sekarang){
		int umur = sekarang - lahir;
		return umur;
	}

	public static void main(String[] args){

		String namaSaya = getNama();
		System.out.println("Nama saya: "+namaSaya);

		int umurSaya = hitungUmur(1999, 2019);
		System.out.println("Umur saya: "+umurSaya);
	}
}
