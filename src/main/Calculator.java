package main;

import java.math.BigDecimal;

public class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public String addStrings(String first, String second) {
        return new BigDecimal(first).add(new BigDecimal(second)).toString();
    }

    public int subtract(int first, int second) {
        return first - second;
    }
}
