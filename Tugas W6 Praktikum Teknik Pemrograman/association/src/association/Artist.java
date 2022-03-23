/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association;

import java.util.List;

/**
 *
 * @author HP
 */
public class Artist {
    private String artist;
    List<Paint> paints;
    
    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Paint> getPaints() {
        return paints;
    }
    public void setArtist(List<Paint> paints) {
        this.paints = paints;
    }  
}
