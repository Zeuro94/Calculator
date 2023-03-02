package org.example.calculator.process;

import org.apache.commons.math3.util.ArithmeticUtils;

public class MathEq implements IMathEq {
    private double add(long a, long b) {
        return ArithmeticUtils.addAndCheck(a, b);
    }

    private double subtract(long a, long b) {
        return ArithmeticUtils.subAndCheck(a, b);
    }

    private double multiply(long a, long b) {
        return ArithmeticUtils.mulAndCheck(a, b);
    }

    private double divide(long a, float b) {
        return a / b;
    }

    @Override
    public double calculate(long a, long b, String operation) {

        switch (operation) {
            case "1" -> {
                return add(a, b);
            }

            case "2" -> {
                return subtract(a, b);
            }

            case "3" -> {
                return divide(a, b);
            }

            case "4" -> {
                return multiply(a, b);
            }
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
