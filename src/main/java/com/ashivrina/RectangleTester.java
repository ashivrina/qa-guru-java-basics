package com.ashivrina;

public class RectangleTester {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(6);
        rectangle.print();
        System.out.println("The area is " + rectangle.calculateArea());
        System.out.println("The perimeter is " + rectangle.calculatePerimeter());
    }
}
