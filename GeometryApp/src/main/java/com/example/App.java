package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        Cube cube = new Cube(6);
        Sphere sphere = new Sphere(7);


        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());


        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("Cube Perimeter: " + cube.getPerimeter());

        System.out.println("Sphere Perimeter: " + sphere.getPerimeter());
        System.out.println("Sphere area: " + sphere.getArea());

        System.out.println("GeometryUtils compare size shapes: " + GeometryUtils.compareSizeShapes(circle, rectangle));
    }
}
