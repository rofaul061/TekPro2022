package Task2;

public class Circle extends Shape{
    private double radius;
    private String color;
    private boolean filled;
    
    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
     public double getArea() {
        return radius*radius*Math.PI;
    }
     
     public double getPerimeter(){
         return 2*Math.PI*radius;
     }
     
    @Override
      public String toString() {
        return "A Circle with radius = " + getRadius() + ",wich is subclass of " + super.toString();
        }
}
