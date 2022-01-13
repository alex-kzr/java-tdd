package main;

import java.math.BigDecimal;

public class SubtractOperation implements Operation{
    @Override
    public void apply(OperandStack stack) {
        BigDecimal value1 = stack.peek();
        stack.pop();
        BigDecimal value2 = stack.peek();
        stack.replaceTop(value2.subtract(value1));
    }
}
