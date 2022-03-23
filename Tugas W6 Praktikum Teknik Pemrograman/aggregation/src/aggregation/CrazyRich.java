/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author HP
 */
public class CrazyRich {
    private String nama;
    private String kekayaan;
    
    // constructor
    CrazyRich(){
        this.nama = " ";
        this.kekayaan = " ";
    }
    
    CrazyRich(String nama, String kekayaan){
        this.nama = nama;
        this.kekayaan = kekayaan;
    }
    
    // method
    public String getNama() {
        return nama;
    }

    public String getKekayaan() {
        return kekayaan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKekayaan(String kekayaan) {
        this.kekayaan = kekayaan;
    }
}
