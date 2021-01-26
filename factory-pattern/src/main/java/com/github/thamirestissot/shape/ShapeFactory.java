package com.github.thamirestissot.shape;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                throw new RuntimeException("You must pass a valid shape");
        }
    }
}
