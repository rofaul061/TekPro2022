/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package association;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Artist artist = new Artist();
            artist.setArtist("Leonardo da vinci");

            Paint paint1 = new Paint();
            paint1.setPaint("Mona Lisa");
            Paint paint2 = new Paint();
            paint2.setPaint("Salvator Mundi");
            Paint paint3 = new Paint();
            paint3.setPaint("Vitruvian Man");

            List<Paint> empList = new ArrayList<Paint>();
            empList.add(paint1);
            empList.add(paint2);
            empList.add(paint3);

            artist.setArtist(empList);

            System.out.println(artist.getPaints()+" merupakan lukisan yang dilukis oleh "+ artist.getArtist());
 
    }
    
}
