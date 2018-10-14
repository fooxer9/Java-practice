/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Дом
 */
import java.math.*;
abstract class Shape {
    protected String color;
    protected boolean filled;
    
    Shape () {
        color = "RED";
        filled = true;
    }
    Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimetr();
    abstract public String toString();
}

public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Circle(10, "BLUE", true);
        System.out.println(s1);
        System.out.println ("Area: " + s1.getArea());
        System.out.println ("Perimetr: " + s1.getPerimetr());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        

Circle c1 = (Circle)s1; // Downcast back to Circle
System.out.println(c1);
System.out.println(c1.getArea());
System.out.println(c1.getPerimetr());
System.out.println(c1.getColor());
System.out.println(c1.isFilled());
System.out.println(c1.getRadius());



Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
System.out.println(s3);
System.out.println(s3.getArea());
System.out.println(s3.getPerimetr());
System.out.println(s3.getColor());

Rectangle r1 = (Rectangle)s3; // downcast
System.out.println(r1);
System.out.println(r1.getArea());
System.out.println(r1.getColor());
System.out.println(r1.getLength());

Square s4 = new Square(6.6); // Upcast
System.out.println(s4);
System.out.println(s4.getArea());
System.out.println(s4.getColor());
System.out.println(s4.getSide());
    
    }
    
}
