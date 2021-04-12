package com.uday.day3;


/**
 * Abstraction Real time demo
 *
 * Shape: Rectangle, Square, Circle, Cone
 * Dim: Length, Height, Radius, Pie
 *
 */

abstract class Shape{
    public double width;
    public double height;
    public double radius;
    public double pie = 3.14f;

    public abstract double getArea();
}

class Rectangle extends Shape{
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println("Rectangle drawing...");
    }


    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape{
    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle drawing...");
    }


    @Override
    public double getArea() {
        return (pie * radius * radius);
    }
}

public class Demo15 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.34,56.78);
        rectangle.draw();
        Circle circle = new Circle(55.55);
        circle.draw();

        rectangle.getArea();
        circle.getArea();
    }
}
