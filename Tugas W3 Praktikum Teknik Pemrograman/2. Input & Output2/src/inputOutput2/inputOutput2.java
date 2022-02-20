package inputOutput2;
import java.util.*; //Berguna untuk pembuatan Scanner

/**
* <h1>Input & Output (2)</h1>
* The Input & Output Program (2) implements an application that will display 
* the following output:
* In each line of output there will be two columns:
* The first column contains a String and is left aligned using exactly 
* 15 characters.
* The second column contains an integer, which is represented by a 3-digit 
* number which if the input has less than three digits, 
* the leading digit will be added to the first zero.
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/

public class inputOutput2 {
        public static void main(String[] args){
            
            //Kamus Data
            String kata;
            int n;
            
            //Membuat array of string dan array of int
            String[] arrstr = new String[3];
            int[] arrint = new int[3];
            
            //Scanner
            Scanner scn = new Scanner(System.in);
            
            //Memasukan scanner ke array dengan looping
            for(int i=0; i<3; i++){
                kata = scn.next();
                arrstr[i] =kata;
                n=scn.nextInt();
                arrint[i] = n;
                }
            //Mencetak output
            System.out.println("================================");
            for(int i=0; i<3; i++){
                //Mencetak output 15 karakter yang diluruskan ke kiri
                //dan karakter ke 16 menampilkan output angka 3 digit yang diawali oleh angka 0
                System.out.format("%-15s%03d%n", arrstr[i], arrint[i]);
            }
           System.out.println("================================");
        }
}