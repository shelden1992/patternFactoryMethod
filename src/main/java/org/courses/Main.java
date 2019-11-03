package org.courses;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeServices shapeServices = new ShapeServices(25);
        List<Shape> randomShapeList = shapeServices.getRandomShapeList();
        shapeServices.drawShape(randomShapeList);
    }
}
