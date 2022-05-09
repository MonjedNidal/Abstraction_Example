package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {

        //Circle object with passed parameters
        Circle circle = new Circle(4,"Red",true);

        System.out.println("Circle area = "+circle.getArea());
        System.out.println("Circle perimeter = "+circle.getPerimeter());
        System.out.println(circle.toString());

        System.out.println("-----------------------------------");

        //Rectangle object with passed parameters
        Rectangle rectangle = new Rectangle(5,12,"Blue",false);

        System.out.println("Rectangle area = "+rectangle.getArea());
        System.out.println("Rectangle Perimeter = "+rectangle.getPerimeter());
        System.out.println(rectangle.toString());


    }
}
