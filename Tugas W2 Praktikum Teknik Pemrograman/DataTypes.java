package datatypes;
import java.util.Scanner;

/**
* <h1> Data Types for each variables input </h1>
* The DataTypes program implements an application that determines 
* for each input variable and the corresponding primitive data type 
* whether the primitive data (byte, short, int, long) is capable of storing it
* @author Rofa'ul Akrom H
* @version 1.0
* @since 2022-02-12
 */


public class DataTypes {

 public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi variabel
        int inputAngka;
       
        // scanner baru 
        Scanner keyboard = new Scanner(System.in);
        
        // user input
        inputAngka = keyboard.nextInt();
        
        // deklarasi variabel untuk menampung angka
        String[] angka = new String [inputAngka];
        
        for (int i = 0; i < inputAngka; i++) {
            angka[i] = keyboard.next();
        }
        
        for (int i = 0; i < inputAngka; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{ // try serupa dengan do
                long parseLong = Long.parseLong(angka[i]);
                System.out.println(parseLong + " can be fitted in:");
                if(parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                    if(parseLong >= -2147483648 && parseLong <= 2147483647){
                         System.out.println("int");
                        if(parseLong >= -32768 && parseLong <= 32767){
                            System.out.println("short");
                        }
                    }
                }
                // jika angka masuk tipe data long
            }catch(NumberFormatException e){
                //jika angka tidak bisa masuk tipe data manapun
                System.out.println(angka[i] + " can't be fitted anywhere");
                }
        }

    }
    
}
