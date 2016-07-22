package com.hamedhr.data.model;

import com.hamedhr.data.enums.TriangleType;
import com.hamedhr.exception.TriangleInequalityRuleNotSatisfied;
import com.hamedhr.exception.TriangleSideNotPositive;
import com.hamedhr.exception.TriangleSideNotZero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TriangleTest {

    @Test
    public void createTriangle() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertNotNull(triangle);
    }

    @Test(expected = TriangleInequalityRuleNotSatisfied.class)
    public void createTriangleWithInEqualityRule() {
        Triangle triangle = new Triangle(1, 1, 3);
        assertNotNull(triangle);
    }

    @Test(expected = TriangleSideNotPositive.class)
    public void createTriangleWithNegativeInput() {
        Triangle triangle = new Triangle(-1, 2, 3);
        assertNotNull(triangle);
    }

    @Test(expected = TriangleSideNotZero.class)
    public void createTriangleWithZeroInput() {
        Triangle triangle = new Triangle(0, 2, 3);
        assertNotNull(triangle);
    }

    @Test
    public void createEquilateralTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertEquals(triangle.getTriangleType(), TriangleType.EQUILATERAL);
    }

    @Test
    public void createIsoscelesTriangle() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertEquals(triangle.getTriangleType(), TriangleType.ISOSCELES);
    }

    @Test
    public void createScaleneTriangle() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertEquals(triangle.getTriangleType(), TriangleType.SCALENE);
    }

}
