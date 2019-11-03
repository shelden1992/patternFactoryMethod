package org.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeServices {
    private static final List<TypeShapes> TYPE_SHAPES = Arrays.asList(TypeShapes.SQUARE_SHAPE, TypeShapes.LINE_SHAPE, TypeShapes.MULTI_SHAPE, TypeShapes.T_SHAPE, TypeShapes.Z_SHAPE);
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
        if (numberShape < 0 || numberShape >= TYPE_SHAPES.size()) {
            throw new IllegalArgumentException("Shape can be 0 - 4");
        }
        return shapeFactory.getShape(numberShape);
    }

    public Shape getRandomShape() {
        return shapeFactory.getShape(generationRandom());
    }

    private int generationRandom() {

        return (int) (Math.random() * TYPE_SHAPES.size());
    }

    public void drawShape(List<Shape> shapeList) {
        if (shapeList.isEmpty()) {
            throw new IllegalArgumentException("List of shame is empty");
        }
        shapeList.forEach(Shape::draw);
    }


}
