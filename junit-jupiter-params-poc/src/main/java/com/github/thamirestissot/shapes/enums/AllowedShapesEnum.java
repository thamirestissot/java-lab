package com.github.thamirestissot.shapes.enums;

public enum AllowedShapesEnum {
    CIRCLE(0), RECTANGLE(1), SQUARE(2);

    private final int code;

    public int getCode() {
        return code;
    }

    public String getName(){
        return this.getName();
    }

    AllowedShapesEnum(int code) {
        this.code = code;
    }
}