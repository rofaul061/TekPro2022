/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author HP
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrazyRich crh = new CrazyRich("Novia", "567000000");
        Aset aset = new Aset("Perkebunan Sawit", "Kalimantan Selatan", "200 Hektare");
        
        CrazyRich crh2 = new CrazyRich();
        crh2.setNama("Egi");
        crh2.setKekayaan("340000000");
        Aset aset2 = new Aset();        
        aset2.setTipe("Tambak Ikan Laut");
        aset2.setLuas("3 hektare");
        aset2.setLokasi("Sumatera Selatan");

        CrazyRich crh3 = new CrazyRich("Ghessa", "6320000");
        Aset aset3 = new Aset("Perkebunan Jati", "Jawa Barat", "19 hektare");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(crh.getNama() + " dengan kekayaan " + crh.getKekayaan() + " yang berasal dari " + aset.getTipe() + " di " + aset.getLokasi() + " yang luasnya " + aset.getLuas() + " miliknya ");
        System.out.println(crh2.getNama() + " dengan kekayaan " + crh2.getKekayaan() + " yang berasal dari " + aset2.getTipe() + " di " + aset2.getLokasi() + " yang luasnya " + aset2.getLuas() + " miliknya ");
        System.out.println(crh3.getNama() + " dengan kekayaan " + crh3.getKekayaan() + " yang berasal dari " + aset3.getTipe() + " di " + aset3.getLokasi() + " yang luasnya " + aset3.getLuas() + " miliknya ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
