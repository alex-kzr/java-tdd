package main;

import java.math.BigDecimal;

public class Calculator {

    private Validation validation;

    public Calculator(Validation validation) {
        this.validation = validation;
    }

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

    public String multiply(String first, String second) {
        BigDecimal firstValue = new BigDecimal(first);
        BigDecimal secondValue = new BigDecimal(second);

        if(firstValue.scale() > 2 || secondValue.scale() >2 ){
            throw new IllegalArgumentException("Too many decimal places.");
        }
        return firstValue.multiply(secondValue).toString();
    }

    public String divide(String first, String second) {
        BigDecimal firstValue = new BigDecimal(first);
        BigDecimal secondValue = new BigDecimal(second);

        if(secondValue.equals(BigDecimal.ZERO)){
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        if(firstValue.scale() > 2 || secondValue.scale() >2 ){
            throw new IllegalArgumentException("Too many decimal places.");
        }
        return firstValue.divide(secondValue).toString();
    }
}
