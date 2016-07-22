package com.hamedhr.data.model;

import com.hamedhr.data.enums.TriangleType;
import com.hamedhr.exception.TriangleInequalityRuleNotSatisfied;
import com.hamedhr.exception.TriangleSideNotPositive;
import com.hamedhr.exception.TriangleSideNotZero;

import java.util.Arrays;
import java.util.List;

public class Triangle {

    private List<Integer> sides;

    public Triangle(int a, int b, int c) {
        sides = Arrays.asList(a, b, c);
        validateSides();
    }

    private void validateSides() {
        assertNoZeroSide();
        assertAllSidesPositive();
        assertTriangleSidesLengthRule();
    }

    private void assertNoZeroSide() {
        for (Integer side : sides) {
            if (side == 0) {
                throw new TriangleSideNotZero();
            }
        }
    }

    private void assertTriangleSidesLengthRule() {
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if (a > b + c || b > a + c || c > a + b) {
            throw new TriangleInequalityRuleNotSatisfied(a, b, c);
        }
    }

    private void assertAllSidesPositive() {
        for (Integer side : sides) {
            if (side < 0) {
                throw new TriangleSideNotPositive(side);
            }
        }
    }

    public TriangleType getTriangleType() {
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);

        if (a == b && b == c) {//c == a is always true if (a == b && b == c) is true
            return TriangleType.EQUILATERAL;
        } else if ((a == b) || (b == c) || (c == a)) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }

}
