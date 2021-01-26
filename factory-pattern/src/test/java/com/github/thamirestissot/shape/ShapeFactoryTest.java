package com.github.thamirestissot.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {

    private ShapeFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new ShapeFactory();
    }

    @Test
    public void getShapeCircleShape() {
        Assert.assertEquals(Circle.class, factory.getShape("circle").getClass());
    }

    @Test
    public void getShapeRectangleShape() {
        Assert.assertEquals(Rectangle.class, factory.getShape("rectangle").getClass());
    }

    @Test
    public void getShapeSquareShape() {
        Assert.assertEquals(Square.class, factory.getShape("square").getClass());
    }

    @Test(expected = RuntimeException.class)
    public void getShapeInvalidShape() {
        factory.getShape("qwert");
    }
}