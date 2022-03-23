/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author HP
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("Suku Cadang Mobil");
        System.out.println("~~~~~~~~~~~~~~~~");
        SukuCadang sukuCadang = new SukuCadang("Castrol", "GS Astra", "Denso", "Akebono Brake");
        Mobil mobil = new Mobil("Mitsubishi XPander", 2020, sukuCadang);
        System.out.println(mobil);
    
        SukuCadang sukuCadang2 = new SukuCadang("Fastron", "Yuasa", "Bosch", "Brembo");
        Mobil mobil2 = new Mobil("Toyota Avanza", 2012, sukuCadang2);
        System.out.println(mobil2);
    }
    
}
