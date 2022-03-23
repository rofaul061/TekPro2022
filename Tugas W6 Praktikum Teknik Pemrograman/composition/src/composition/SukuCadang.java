/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author HP
 */
public class SukuCadang {
    private String oli;
    private String aki;
    private String busi;
    private String sistemRem;
    
    SukuCadang(String oli, String aki, String busi,String sistemRem){
        this.oli = oli;
        this.aki = aki;
        this.busi = busi;
        this.sistemRem = sistemRem;
    }
    
    SukuCadang(){
        this.oli = " ";
        this.aki = " ";
        this.busi = " ";
        this.sistemRem = " ";
    }
    
    public String toString(){
        return String.format("Oli : %s\nAki : %s\nBusi : %s\nKampas Rem : %s", this.oli, this.aki, this.busi, this.sistemRem);
    }
}
