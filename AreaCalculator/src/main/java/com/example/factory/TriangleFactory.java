package com.example.factory;

import com.example.model.Point;
import com.example.model.Shape;
import com.example.model.Triangle;
import java.util.List;

/**
 * Author: ASOU SAFARI
 * Date:8/18/24
 * Time:6:44 PM
 */
public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape createShape(List<Point> points) {
        return new Triangle(points);
    }
}
