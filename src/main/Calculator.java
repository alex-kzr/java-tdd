package main;

import java.math.BigDecimal;

public class Calculator {

    public String add(String first, String second) {
        BigDecimal firstValue = new BigDecimal(first);
        BigDecimal secondValue = new BigDecimal(second);

        if(firstValue.scale() > 2 || secondValue.scale() >2 ){
            throw new IllegalArgumentException("Too many decimal places.");
        }
        return firstValue.add(secondValue).toString();
    }

    public String subtract(String first, String second) {
        BigDecimal firstValue = new BigDecimal(first);
        BigDecimal secondValue = new BigDecimal(second);

        if(firstValue.scale() > 2 || secondValue.scale() >2 ){
            throw new IllegalArgumentException("Too many decimal places.");
        }
        return firstValue.subtract(secondValue).toString();
    }

    public String myltiply(String first, String second) {
        return new BigDecimal(first).multiply(new BigDecimal(second)).toString();
    }
}
