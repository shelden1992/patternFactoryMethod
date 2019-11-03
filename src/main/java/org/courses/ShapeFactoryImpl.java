package org.courses;

public class ShapeFactoryImpl implements ShapeFactory {

    public ShapeFactoryImpl() {
    }

    public Shape getShape(int shapeId) {
        switch (shapeId) {
            case 0:
                return new LineShape(0, new int[][]{{1, 1, 1, 1}});
            case 1:
                return new ZShape(1, new int[][]{{1, 1, 0}, {0, 1, 1}});
            case 2:
                return new TShape(2, new int[][]{{1, 1, 1}, {0, 1, 0}});
            case 3:
                return new SquareShape(3, new int[][]{{1, 1}, {1, 1}});
        }
        return new MultiShape(4, new int[][]{{1, 1, 1}, {0, 1, 0}, {1, 1, 1}});
    }
}
