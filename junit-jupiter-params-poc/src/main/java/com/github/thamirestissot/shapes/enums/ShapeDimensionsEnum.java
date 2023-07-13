package com.github.thamirestissot.shapes.enums;

public enum ShapeDimensionsEnum {
    Bidimencional(2), Tridimencional(3);

    private final int code;

    public int getCode() {
        return this.code;
    }

    ShapeDimensionsEnum(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.name().toString();
    }
}