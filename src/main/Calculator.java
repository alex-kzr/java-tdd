package main;

import java.math.BigDecimal;

public class Calculator {

    private final OperandStack accumulator = new OperandStack();

    public BigDecimal getAccumulator() {
        return accumulator.peek();
    }

    public void setAccumulator(BigDecimal value) {
        accumulator.replaceTop(value);
    }

    public void enter() {
        accumulator.push(getAccumulator());
    }

    public void drop() {
        accumulator.pop();
    }

    public void add() {
        Operation addOperation = new AddOperation();
        addOperation.apply(accumulator);
    }

    public void subtract() {
        BigDecimal value1 = accumulator.peek();
        accumulator.pop();
        BigDecimal value2 = accumulator.peek();
        accumulator.replaceTop(value2.subtract(value1));
    }
}
