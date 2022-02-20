package inputOutput;
import java.util.*; //Berguna untuk pembuatan Scanner

/**
* <h1>Input & Output</h1>
* Program Input & Output is an application that will display the output:
* On the first line, print an integer, n, indicating the number of tokens in the string s (no need to be unique).
* On the next line, print each of the n tokens on a new line in the same order as they appear in the input string s.
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/

public class inputOutput {
    
    public static void main(String[] args) {
        
        //Kamus Data
        String x;
        int y;
        
        //Scanner
        Scanner scn = new Scanner(System.in);
        
        //Memasukan scanner kedalam string s
        x = scn.nextLine();
        
        //Membuat array of string agar string terpisah dan menjadi token berdasarkan format specifier
        String[] stringarr = x.split("[@ ? !_ , . ']+");
        
        //n sebagai jumlah token stringarr
        y = stringarr.length;
        
        //Mencetak n
        System.out.println(y);
        
        //Mencetak token berurutan
        for(int i=0; i < y; i++){
            System.out.println(stringarr[i]);
        }
      }
    }
