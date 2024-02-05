package com.techmeskills.lesson7.task2.data;

import com.techmeskills.lesson7.task2.common.Figure;
/*
class contains information about the circle
 */
public class Circle extends Figure {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
