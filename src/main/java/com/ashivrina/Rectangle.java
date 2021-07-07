package com.ashivrina;

public class Rectangle {

    private double length;
    private double width;
    static int numOfSides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * width) + (2 * length);
    }

    public double calculateArea() {
        return width * length;
    }

    public void print() {
        System.out.println("This is a rectangle with a length: " + length
                + ", and with a width: " + width);
    }
}
