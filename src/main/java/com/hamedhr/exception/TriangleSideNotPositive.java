package com.hamedhr.exception;

public class TriangleSideNotPositive extends RuntimeException {
    public TriangleSideNotPositive(Integer side) {
        super(String.valueOf(side));
    }
}
