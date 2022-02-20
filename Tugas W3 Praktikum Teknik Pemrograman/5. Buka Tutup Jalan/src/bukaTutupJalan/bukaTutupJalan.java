package bukaTutupJalan;
import java.util.*; //Berguna untuk pembuatan Scanner

/**
* <h1>Buka Tutup Jalan</h1>
* The Road Open and Close program implements the implementation that 
* every four cars that pass are added up with each number. 
* If (combined sum minus 999999) the result is divided by 5, 
* the remainder is 0 then 4 cars must stop, and let another car from 
* the opposite direction go. And vice versa.
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/
public class bukaTutupJalan {
    public static void main(String[] args){
        //Scanner
        Scanner scn = new Scanner(System.in);
        
        //array int
        int[] array = new int[4];
        
        //memasukan scanner kedalam array int
        for(int i=0; i<4; i++ ){
            array[i] = scn.nextInt();
        }
        
        //membuat string (menampung hasil array int menjadi string)
        //replaceAll() digunakan untuk menghapus karakter "[", ",", dan "]" dari output toString()
        String s = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
        
        //untuk mengconvert string ke tipe data long
        long angka = Long.parseLong(s);
        
        //pengecekan kondisi apabila gabungan angka dikurangi 999999 dan hasil bagi adalah 0
        //output mencetak "berhenti" dan hasil bagi adalah 1 mencetak "jalan"
        if(0==(angka-999999)%5){
            System.out.println("jalan");
        }else {
            System.out.println("berhenti");
        }
    }
}