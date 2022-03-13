/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasus2;

/**
 *
 * @author Rofa'ul
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      Menu Makanan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tPesanan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        menu.pesan("Bala-bala", 9);
        menu.pesan("Gehu", 15);
        menu.pesan("Tahu", 7);
        menu.pesan("Molen", 20);
        menu.pesan("Karoket", 4);
        
        menu.tampilMenuMakanan();

    }
}

