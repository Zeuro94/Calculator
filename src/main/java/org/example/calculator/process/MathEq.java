package org.example.calculator.process;

public class MathEq implements IMathEq {
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double calculate(double a, double b, String operation) {

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
