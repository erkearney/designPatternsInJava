import java.util.ArrayList;
import java.util.List;

interface ShapeInterface {
    void aboutShape();
    double calculateArea();
}

class Rectangle implements ShapeInterface {
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void aboutShape() {
        System.out.println("Rectangle object with length: " + this.length + " units and width: " + this.width + " units.");
    }

    public double calculateArea() {
        return this.length * this.width;
    }
}

class Triangle implements ShapeInterface {
    public double base;
    public double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void aboutShape() {
        System.out.println("Triangle object with base: " + this.base + " units and height: " + this.height + " + units.");
    }

    public double calculateArea() {
        return this.base * this.height / 2;
    }
}

class AdapterPatternExample {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Example***\n");
        Triangle t = new Triangle(20, 10);
        System.out.println("Area of the triangle is " + t.calculateArea());
    }
}
