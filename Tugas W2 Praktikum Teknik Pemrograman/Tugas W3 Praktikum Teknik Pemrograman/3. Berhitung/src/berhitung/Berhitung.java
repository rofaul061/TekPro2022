package berhitung;
import java.util.*; //Berguna untuk pembuatan Scanner

/**
* <h1>Berhitung!!!</h1>
* The Numerical Program implements an application that will output a single line 
* containing an integer, the result "A operator B".
* (Calculator)
* <p>
* @author:  Rofa'ul Akrom Hendrawan
* <p>
* @version:  1.0
* @since 2022-02-19
*/
public class Berhitung{
    public static void main(String[] args) {
        //Kamus Data
        int A, B, hasil;
        char operator;
        
        //Scanner 
        Scanner scn = new Scanner(System.in);
        
        //memasukan scanner ke variabel A
        A = scn.nextInt();
        
        //char At digunakan agar scanner masuk ke variabel tipe data char
        operator = scn.next().charAt(0);
        
        //memasukan scanner ke variabel B
        B = scn.nextInt();
        
        //pengecekan operator berdasarkan input user dan hasil operasi dicetak
        if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){
            switch(operator){
                case '+' : hasil = A + B;
                    System.out.println(hasil); break;
                case '-' : hasil = A - B;
                    System.out.println(hasil); break;
                case '*' : hasil = A * B;
                    System.out.println(hasil); break;
                case '/' : hasil = A / B;
                    System.out.println(hasil); break;
                case '%' : hasil = A % B;
                    System.out.println(hasil); break;
                default : //jika user salah/menginputkan operator tidak sesuai ketentuan
                    System.out.println("Operator yang anda input SALAH!!! ");
            }
        }else //jika user salah/menginputkan angka tidak sesuai ketentuan
                System.out.println("Angka yang anda input SALAH!!!");                        
            }
        }
        
   