package main;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {

    private Stack<BigDecimal> accumulator = new Stack<>();

    public BigDecimal getAccumulator() {
        if(accumulator.size() == 0) {
            return BigDecimal.ZERO;
        }
        return accumulator.peek();
    }

    public void setAccumulator(BigDecimal value) {
        if(accumulator.size() > 0) {
            accumulator.pop();
        }
        accumulator.push(value);
    }

    public void enter() {
        accumulator.push(getAccumulator());
    }

    public void drop() {
        accumulator.pop();
    }
}
