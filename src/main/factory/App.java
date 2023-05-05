package main.factory;

public class App {
    public static void main(String[] args) {
        Shape square = ShapeFactory.createShape(ShapeType.SQUARE);
        square.draw();

        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
