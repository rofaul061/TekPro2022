package operators;

/**
* <h1> Data Types for each variables input </h1>
* The DataTypes program implements an application that determines 
* for each input variable and the corresponding primitive data type 
* whether the primitive data (byte, short, int, long) is capable of storing it
* <p>
* author Rofa'ul Akrom H
* <p>
* version 1.0
* @since 2022-02-13
 */

public class FloatingPoint{
public static void main(String[] args) {
    double x = 92.98; //penggunaan double untuk menginputkan data desimal (seperti float)
    int nx = (int) Math.round(x); //math round bertujuan untuk membulatkan nilai angke ke bilangan terdekat 0,5 ke atas dibulatkan ke atas & 0,5 kebawah dibulatkan kebawah
     System.out.println(nx); //penambahan system.out.pintln(nx) untuk menampilkan hasil di layar
}
}