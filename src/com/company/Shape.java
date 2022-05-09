package com.company;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    //Constructor to use in the subclass.
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Color setter and getter.
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Filled setter and getter.
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    //toString function to print the shape properities.
    public String toString(){
        return "Shape[color="+color+",filled="+filled+"]";
    }
}
