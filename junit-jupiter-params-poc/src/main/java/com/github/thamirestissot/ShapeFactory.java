package com.github.thamirestissot;

import com.github.thamirestissot.shapes.Shape;
import com.github.thamirestissot.shapes.bidimencional.Circle;
import com.github.thamirestissot.shapes.bidimencional.Rectangle;
import com.github.thamirestissot.shapes.bidimencional.Square;
import com.github.thamirestissot.shapes.enums.AllowedShapesEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShapeFactory {
    private final List<AllowedShapesEnum> allowedShapesList;

    public List<AllowedShapesEnum> getAllowedShapesList() {
        return this.allowedShapesList;
    }

    public ShapeFactory() {
        this.allowedShapesList = new ArrayList<>();
        Arrays.stream(AllowedShapesEnum.values()).forEach(allowedShapesEnum -> this.allowedShapesList.add(allowedShapesEnum));
    }

    public Shape getShape(String shapeType) {
        //TODO: pesquisar forma elegante de escolher entre os names do AllowedShapesEnum.
        switch (shapeType) {

            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                StringBuffer exceptionMessage = new StringBuffer("Must pass a valid shape." + "\nThe valids shapes are:");
                Arrays.stream(AllowedShapesEnum.values()).toList().forEach(allowedShapesEnum -> exceptionMessage.append("\n\t- " + allowedShapesEnum.getName()));
                throw new RuntimeException(exceptionMessage.toString());
        }
    }
}
