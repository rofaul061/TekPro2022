/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependence;

/**
 *
 * @author HP
 */
public class Person {
    private String nama;
    
    Person(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void display(Handphone l){
        System.out.println("Hanphone " + getNama());
        System.out.println("Nama : " + l.getHp());
        System.out.println("Ram : " + l.getRam());
        System.out.println("Storage : " + l.getStorage());
        System.out.println("Warna : " + l.getWarna());
        System.out.println("Harga : " + l.getHarga());
        System.out.println();
    }
    
    public void jualHandphone(Handphone l){
        l.jualHandphone();
        System.out.println("oleh " + getNama());
    }
}
