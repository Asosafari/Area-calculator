package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Author: ASOU SAFARI
 * Date:8/18/24
 * Time:5:49PM
 */
@Data
@AllArgsConstructor
public class Polygon implements Shape {
    private List<Point> points;

    @Override
    public double calculateArea() {
        int n = points.size();
        double area = 0;

        // shoelace area formula
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            area += (points.get(i).getX() * points.get(j).getY()) - (points.get(j).getX() * points.get(i).getY());
            j = i;
        }
        return Math.abs(area / 2);
    }

}
