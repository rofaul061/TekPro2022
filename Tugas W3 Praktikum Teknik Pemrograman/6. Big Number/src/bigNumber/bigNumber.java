package bigNumber;
import java.util.*; //Berguna untuk pembuatan Scanner
import java.math.BigInteger; //untuk membuat tipe data BigInteger

/**
* <h1>Big Number</h1>
* The Large Number program implements an application that will output 
* two lines of output. The first line contains a + b, the second line 
* contains a x b, and does not print leading zeros.
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/

public class bigNumber {
    public static void main(String[] args) {
        //membuat scanner baru
        Scanner scn = new Scanner(System.in);
        
        //membuat variabel bertipe data BigInteger dan memasukan scanner ke  variabel
        BigInteger a = scn.nextBigInteger();
        BigInteger b = scn.nextBigInteger();
        
        //c merupakan hasil dari a + b
        BigInteger c = a.add(b); //add = +
        
        //d merupakan hasil dari a * b
        BigInteger d = a.multiply(b);//multiply = *
        
        //mencetak c dan d
        System.out.println(c);
        System.out.println(d);
    }
}