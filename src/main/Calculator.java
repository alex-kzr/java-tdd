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

    public void execute(String operator) {

        Operation operation = null;

        if ("+".equals(operator))
            operation = new AddOperation();
        else if ("-".equals(operator))
            operation = new SubtractOperation();

        operation.apply(accumulator);
    }
}
