package kasus3;


public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    
   
    
    @Override // Menambahkan fitur Override 
    void printDojutsu() {
        super.printDojutsu(); 
        // Menambahkan super.printDojutsu agar Rinnegan, Mangekyou Sharingan,
        // dan Sharingan tampil
        System.out.println(this.Dojutsu);
    }
}