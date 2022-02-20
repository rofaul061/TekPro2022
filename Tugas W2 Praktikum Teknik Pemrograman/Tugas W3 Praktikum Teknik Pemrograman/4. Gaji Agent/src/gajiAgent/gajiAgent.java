package gajiAgent;
import java.util.*; //Berguna untuk pembuatan Scanner

/**
* <h1>Gaji Agent</h1>
* The Salary Agent program implements an application that will display 
* a one-line output containing a number in the form of salary received after 
* getting a bonus or fine
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/

public class gajiAgent {
    public static void main(String[] args) {
        
        // Kamus Data
        int totalItem;
        double bonus, denda, totalGaji;
        
        //scanner 
        Scanner scn = new Scanner(System.in);
        
        //memasukan scanner ke variabel
        totalItem = scn.nextInt();
        
        //Pengecekan kondisi berdasarkan penjualan item yang akan memasukan bonus dan denda
        if(totalItem >= 40){
            bonus = (25*0.01)*(totalItem*50000);
            totalGaji = 500000 + bonus;
        }else if(totalItem > 80){
            bonus = (35*0.01)*(totalItem*50000);
            totalGaji = 500000 + bonus;
        }else if(totalItem < 15){
            totalItem = 15 - totalItem;
            denda = (15*0.01)*(totalItem*50000);
            totalGaji = 500000 - denda;
        }else{
            bonus = (10*0.01)*(totalItem*50000);
            totalGaji = 500000 + bonus;    
        }
        
        //Mencetak total gaji Agent, (int) digunakan untuk casting yang mengubah tipe data totalGaji ke tipe int
        System.out.println((int)totalGaji);
    }
}