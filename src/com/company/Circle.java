package com.company;

public class Circle extends Shape{

    protected double radius;

    //Constructors
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //Radius setter and getter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Implementation of the abstract methods
    @Override
    double getArea() {
        return radius*radius*3.14;
    }
    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
