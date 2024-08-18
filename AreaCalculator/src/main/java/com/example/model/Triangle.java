package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Author: ASOU SAFARI
 * Date:8/18/24
 * Time:6:12PM
 */
@Data
@AllArgsConstructor
public class Triangle implements Shape{
    List<Point> points;

    private double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public double calculateArea() {
        double a = calculateDistance(points.get(0),points.get(1));
        double b = calculateDistance(points.get(1), points.get(2));
        double c = calculateDistance(points.get(0), points.get(2));

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
