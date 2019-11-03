package org.courses;

import java.util.ArrayList;
import java.util.List;

public class ShapeServices {
    private static final int QUANTITY_OF_SHAPE = 5;
    private static ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();
    private int numberShapeCreated;

    public ShapeServices() {
    }

    public ShapeServices(int numberShapeCreated) {
        this.numberShapeCreated = numberShapeCreated;
    }

    public List<Shape> getRandomShapeList() {
        if (numberShapeCreated == 0) {
            this.numberShapeCreated = 1;
        }
        List<Shape> shapeList = new ArrayList<>();
        for (int i = 0; i < numberShapeCreated; i++) {
            Shape shape = shapeFactory.getShape(generationRandom());
            shapeList.add(shape);
        }
        return shapeList;
    }

    public Shape getShape(int numberShape) {
        if (numberShape < 0 || numberShape >= QUANTITY_OF_SHAPE) {
            throw new IllegalArgumentException("Shape can be 0 - 4");
        }
        return shapeFactory.getShape(numberShape);
    }

    public Shape getRandomShape() {
        return shapeFactory.getShape(generationRandom());
    }

    private int generationRandom() {

        return (int) (Math.random() * QUANTITY_OF_SHAPE);
    }

    public void drawShape(List<Shape> shapeList) {
        if (shapeList.isEmpty()) {
            throw new IllegalArgumentException("List of shame is empty");
        }
        shapeList.forEach(Shape::draw);
    }


}
