/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association;

/**
 *
 * @author HP
 */
public class Paint {
     /*State*/
    private String paint;

    public String getPaint() {
        return this.paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    @Override
    public String toString(){
        return paint;
    }
}
