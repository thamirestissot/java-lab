package com.github.thamirestissot.shapes.bidimencional;

import com.github.thamirestissot.shapes.Shape;
import com.github.thamirestissot.shapes.enums.ShapeDimensionsEnum;

public class Rectangle extends Shape {
    private ShapeDimensionsEnum dimensions;

    public Rectangle() {
        super(2);
    }

    @Override
    public void draw() {
        System.out.println("██▓▓▓▓▓▓▓▓▓▓██\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "██▓▓▓▓▓▓▓▓▓▓▒▒\n");
    }
}
