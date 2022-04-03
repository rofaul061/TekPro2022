package Task2;

public class TestShape {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape a = new Shape();
        System.out.println(a);
        Shape b = new Shape("Grey", false);
        System.out.println(b);
        
        Circle c = new Circle();
        System.out.println(c);
        Circle d = new Circle(14);
        System.out.println(d);
        Circle e = new Circle(15, "Blue", false);
        System.out.println(e);
        
        Rectangle f = new Rectangle();
        System.out.println(f);
        Rectangle g = new Rectangle(14, 14);
        System.out.println(g);
        Rectangle h = new Rectangle(15, 15, "Blue", false);
        System.out.println(h);
        
        Square i = new Square();
        System.out.println(i);
        Square j = new Square(14);
        System.out.println(j);
        Square k = new Square(15, "Blue", false);
        System.out.println(k);
    }
}
