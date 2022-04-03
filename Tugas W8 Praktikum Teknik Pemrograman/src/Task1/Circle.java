package Task1;

public class Circle {
    // private instance variable, not accessible from outside this class 
    private double radius; 
    private String color;
    
    /** Constructs a Circle instance with default value for radius and color */ 
    public Circle() { // 1st (default) constructor 
        radius = 1.0; 
        color = "red";
    } 
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor 
        radius = r; 
        color = "red"; 
    }
 
    public Circle(double r, String color){
        this.color = color;
        this.radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Returns the radius */
    public double getRadius() {
        return radius;
        }

        /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
        }
     
     /** Return a self-descriptive string of this instance in the form of
     Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
        }
}
