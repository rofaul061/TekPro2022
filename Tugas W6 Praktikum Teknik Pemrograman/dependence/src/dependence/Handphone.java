/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependence;

/**
 *
 * @author HP
 */
public class Handphone {
    private String hp;
    private int ram;
    private int storage;
    private int harga;
    private String warna;

    
    Handphone(String hp, int ram, int storage, int harga, String warna){
        this.hp = hp;
        this.ram = ram;
        this.storage = storage;
        this.harga = harga;
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setRam(int Ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }
    
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }
    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getHarga() {
        return harga;
    }    
    public void jualHandphone(){
        System.out.print("Hanphone dijual ");
    }
}
