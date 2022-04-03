package Task2;

public class Rectangle extends Shape{
    private double width;
    private double length;
    private String color;
    private boolean filled;
    
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length,String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return getLength()*getWidth();
    }
    
    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }
   
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", wich is a subclass of " + super.toString();
    }  
}
