package com.example;




public class GeometryUtils {
    public static double convertAreaToSquareMeters(double area, String unit) {
        switch (unit) {
            case "cm":
                return area / 10000;
            case "mm":
                return area / 1000000;
            default:
                return area;
        }
    }

    public static boolean compareSizeShapes(Shape shape1, Shape shape2) {
        return shape1.getArea() == shape2.getArea() && shape1.getPerimeter() == shape2.getPerimeter();
    }
}
