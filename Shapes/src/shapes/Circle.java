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
public class Circle extends Shape {
protected double radius;
public Circle () {
    radius  = 1.0;
    color = "RED";
    filled = true;
}
Circle (double r, String c, boolean f) {
    radius = r;
    color = c;
    filled = f;
}
Circle (double radius) {
    this.radius = radius;
    color = "BLUE";
    filled = true;
}
public double getRadius(){
    return this.radius;
}
public void setRadius(double radius) {
    this.radius = radius;
}
    @Override
    public double getArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return Math.PI*radius*radius;
    
    }

    @Override
    public double getPerimetr() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return Math.PI*2*radius;
    
    }

    @Override
    public String toString() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "Shape: circle, color: " + this.color + ", radius: " + this.radius;
    
    }
    
}
