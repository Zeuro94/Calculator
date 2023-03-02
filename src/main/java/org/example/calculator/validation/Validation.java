package org.example.calculator.validation;

public class Validation implements IValidate {

    @Override
    public boolean tryParseLong(String numberToBeParsed) {
        try {
            Long.parseLong(numberToBeParsed);
            return true;
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
