package operators1;

/**
* <h1> Type data conversion </h1>
* The Operator1 program implements an application 
* that will convert large to small data types 
* (long -> int -> short) and (double -> float -> bytes).
* <p>
* author Rofa'ul Akrom H
* <p>
* version 1.0
* @since 2022-02-13
 */

public class ConvertDataType {

   static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
    
}
