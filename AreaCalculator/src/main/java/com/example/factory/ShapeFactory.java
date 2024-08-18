package com.example.factory;

import com.example.model.Point;
import com.example.model.Shape;
import java.util.List;

public interface ShapeFactory {
    Shape createShape(List<Point> points);
}
