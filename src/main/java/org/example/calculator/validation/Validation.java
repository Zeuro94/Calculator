package org.example.calculator.validation;

public class Validation implements IValidate {

    boolean flag = true;
    @Override
    public boolean checkIfIsAValidNumber(String value) {

        try {
            Double.parseDouble(value);
        }
        catch (NumberFormatException e) {
            System.out.println("invalid number " + e.getMessage());
            return false;
        }
        return flag;
    }
}
