package com.example.service;

import com.example.factory.PolygonFactory;
import com.example.factory.ShapeFactory;
import com.example.factory.TriangleFactory;
import com.example.model.Point;
import com.example.model.Shape;
import java.util.ArrayList;
import java.util.List;


public class ShapeApplication {

    public static void main(String[] args) {
        ShapeFactory factory;

        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(4, 3));
        points.add(new Point(0, 3));

        factory = new PolygonFactory();
        Shape polygon = factory.createShape(points);
        double area = polygon.calculateArea();
        System.out.println("Surface Area of Polyhedra: " + area);

        points.removeFirst();
        factory = new TriangleFactory();
        Shape triangle = factory.createShape(points);
        double area1 = triangle.calculateArea();
        System.out.println("Surface Area of Triangle: " + area1);
    }
}
