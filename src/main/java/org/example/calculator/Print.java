package org.example.calculator;

public class Print {

    private Operation operation;

    private ReadValues readValues;

    public Print(Operation operation, ReadValues readValues) {
        this.operation = operation;
        this.readValues = readValues;
    }


    public void printOptions() {
        System.out.println("Selecteaza operatia matematica:");
        System.out.println("1. Adunare ");
        System.out.println("2. Scadere");
        System.out.println("3. Impartire");
        System.out.println("4. Inmultire");
    }

    public void options(String option) {
        switch (option) {
            case "1" -> System.out.println(operation.add(Double.parseDouble(readValues.getFirstValue()), Double.parseDouble(readValues.getSecondValue())));
            case "2" -> System.out.println(operation.subtract(Double.parseDouble(readValues.getFirstValue()), Double.parseDouble(readValues.getSecondValue())));
            case "3" -> System.out.println(operation.divide(Double.parseDouble(readValues.getFirstValue()), Double.parseDouble(readValues.getSecondValue())));
            case "4" -> System.out.println(operation.multiply(Double.parseDouble(readValues.getFirstValue()), Double.parseDouble(readValues.getSecondValue())));
            default -> System.out.println("Operatie invalida");
        }
    }

}