package strings;
import java.util.Scanner;

/**
* <h1> String!!! </h1>
* The string program implements an application 
* that determines two English lowercase strings, 
* A and B, performs 3 operations namely: 
* the sum of the lengths of A and B, determines whether A is lexicographically 
* greater than B (ie: does B come before A in the dictionary?), 
* use the first letters of A and B and print them on a single line, 
* separated by spaces.
* <p>
* author Rofa'ul Akrom H
* <p>
* version 1.0
* @since 2022-02-13
 */

public class Main {

    public static void main(String[] args) {
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // deklarasi variabel
        String a, b, output;
        int totalStr;
        
        // penginputan string
        a = scan.next();
        b = scan.next();
        
        totalStr = a.length() + b.length();
        System.out.println(totalStr);
        
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }else if(b.compareTo(a) > 0){
            System.out.println("No");
        }else{
            System.out.println("Are Equals");
        }
        
        output = a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(output);
    }
    
}
