package main.factory;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {
        switch (type) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Shape type not found.");
        }
    }
}
