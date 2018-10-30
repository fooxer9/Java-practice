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
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle() {
        width = 1.0;
        length = 1.5;
        color = "RED";
        filled = false;
    }
    Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
        color = "BLUE";
        filled = false;
    }
    Rectangle (double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth () {
        return width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getLength () {
        return length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        
        return width*length;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimetr() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, color: " + this.color + ", width: " + this.width + ", length: " + this.length;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
