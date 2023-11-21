package com.teachmeskills.homework.lesson7.task2.shape;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea(){
        double a = (sideA + sideB + sideC) / 2;
        return Math.sqrt(a * (a - sideA) * (a - sideB) * (a - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
