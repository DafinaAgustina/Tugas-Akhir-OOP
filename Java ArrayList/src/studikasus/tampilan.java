/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class tampilan {
    ArrayList<Barang> tampung;
     
    public tampilan()
    {
        //instansiasi
        tampung = new ArrayList<Barang>();
    }
     
    public void isiData(int id,String kd,String nm)
    {
        tampung.add(new Barang(id,kd,nm));
    }
     
    public void showData()
    {
        for(Barang barang:tampung)
        {
            System.out.println("id brg : "+barang.getId()+""+", kd brg : "+barang.getKd()+""+", nm brg : "+barang.getNm());
        }
    }
 
    public static void main(String args[])
    {
        tampilan td = new tampilan();
 
        td.isiData(1,"01","topi");
        td.isiData(2,"02","kemeja");
        td.isiData(3,"03","sepatu");
        td.isiData(4,"04","sandal");
 
        td.showData();
    }
}
