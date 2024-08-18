package com.example.factory;

import com.example.model.Point;
import com.example.model.Polygon;
import com.example.model.Shape;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * Author: ASOU SAFARI
 * Date:8/18/24
 * Time:6:01PM
 */
@NoArgsConstructor
public class PolygonFactory implements ShapeFactory{
    @Override
    public Shape createShape(List<Point> points) {
        return new Polygon(points);
    }
}
