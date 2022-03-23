/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependence;

/**
 *
 * @author HP
 */
public class Dependence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Novia");
        Handphone hp = new Handphone("Iphone 13 Pro Max", 6, 1000, 26700000, "Blue Sierra");
        person.display(hp);
        

        Person person2 = new Person("Egi");
        Handphone hp2 = new Handphone("Samsung Z Fold 3   ", 12, 256, 24900000, "Browne");
        person2.display(hp2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person2.jualHandphone(hp2);
        System.out.println();
    }
    
}
