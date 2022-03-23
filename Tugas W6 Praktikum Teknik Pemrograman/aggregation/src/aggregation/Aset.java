/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author HP
 */
public class Aset {
    private String tipe;
    private String luas;
    private String lokasi;

    // constructor
    Aset(){
        this.tipe = "";
        this.lokasi = " ";
        this.luas = " ";
    }

    Aset(String tipe, String lokasi, String luas){
        this.tipe = tipe;
        this.lokasi = lokasi;
        this.luas = luas;
    }
    
    // method
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }    
    
    public String getTipe() {
        return tipe;
    }

    public String getLuas() {
        return luas;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }
    
}
