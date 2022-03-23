/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author HP
 */
public class Mobil {
    private String mobil;
    private int tahun;
    private SukuCadang sukuCadang;
    
    // constructor
    Mobil(String mobil, int tahun, SukuCadang sukuCadang){
        this.mobil = mobil;
        this.tahun = tahun;
        this.sukuCadang = sukuCadang;
    }
    
    Mobil(){
        this.mobil = " ";
        this.tahun = 0;
    }

    public String getMobil() {
        return mobil;
    }

    public int getTahun() {
        return tahun;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String toString(){
        return String.format("Mobil : %s\nTahun : %d\n%s\n", this.mobil, this.tahun, this.sukuCadang);
    }
}
