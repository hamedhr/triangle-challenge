package com.hamedhr.exception;

public class TriangleInequalityRuleNotSatisfied extends RuntimeException {
    private Integer aSide;
    private Integer bSide;
    private Integer cSide;

    public TriangleInequalityRuleNotSatisfied(Integer aSide, Integer bSide, Integer cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public Integer getaSide() {
        return aSide;
    }

    public Integer getbSide() {
        return bSide;
    }

    public Integer getcSide() {
        return cSide;
    }
}
