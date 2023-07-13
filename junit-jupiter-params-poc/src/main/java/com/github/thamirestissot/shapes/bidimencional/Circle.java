package com.github.thamirestissot.shapes.bidimencional;

import com.github.thamirestissot.shapes.Shape;

public class Circle extends Shape {
    public Circle() {
        super(2);
    }
    @Override
    public void draw() {
        System.out.println("\n" +
                "        x  x    \n" +
                "     x        x \n" +
                "    x          x\n" +
                "    x          x\n" +
                "     x        x \n" +
                "        x  x    \n");
    }
}
