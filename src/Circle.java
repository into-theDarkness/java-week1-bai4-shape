import java.util.Scanner;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 2 * 3.14;
    }

    public double getPerimeter() {
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius =" + getRadius() + " with Area: "  +getArea()+  "with Perimeter: " + getPerimeter() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);



    }

}
