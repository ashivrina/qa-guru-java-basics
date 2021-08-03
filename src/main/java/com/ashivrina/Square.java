package com.ashivrina;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return numOfSides * 4;
    }
}
