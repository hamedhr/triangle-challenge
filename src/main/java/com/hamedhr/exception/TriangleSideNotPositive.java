package com.hamedhr.exception;

/**
 * Created by hamed on 7/22/2016.
 */
public class TriangleSideNotPositive extends RuntimeException {
    public TriangleSideNotPositive(Integer side) {
        super(String.valueOf(side));
    }
}
