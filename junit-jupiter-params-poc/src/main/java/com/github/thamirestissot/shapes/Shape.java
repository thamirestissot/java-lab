package com.github.thamirestissot.shapes;

import com.github.thamirestissot.shapes.enums.ShapeDimensionsEnum;

import java.util.Arrays;

public abstract class Shape {
    public ShapeDimensionsEnum dimensions;
    private ShapeDimensionsEnum getDimensions() {
        return this.dimensions;
    }
    public Shape(int dimensionsCode) {

        this.dimensions= Arrays.stream(ShapeDimensionsEnum.values())
                .filter(shapeDimensionsEnum -> shapeDimensionsEnum.getCode() == dimensionsCode)
                .findFirst()
                .get();
    }

    public abstract void draw();
}
