package com.teachmeskills.homework.lesson7.task2.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
