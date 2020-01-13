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
public class Barang {
    int id;
    String kd,nm;
 
    public Barang(int id, String kd, String nm)
    {
        this.id = id;
        this.kd = kd;
        this.nm = nm;
    }
     
    public int getId()
    {
       return id;
    }
     
    public String getKd()
    {
       return kd;
    }
     
    public String getNm()
    {
       return nm;
    }
}

