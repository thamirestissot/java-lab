package com.github.thamirestissot.shapes.bidimencional;

import com.github.thamirestissot.shapes.Shape;
import com.github.thamirestissot.shapes.enums.ShapeDimensionsEnum;

public class Square extends Shape {
    private ShapeDimensionsEnum dimensions;

    public Square() {
        super(2);
    }
    @Override
    public void draw() {
        System.out.println("██▓▓▓▓▓▓▓▓▓▓██\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "▓▓          ░░\n" +
                "██▓▓▓▓▓▓▓▓▓▓▒▒\n");
    }
}
