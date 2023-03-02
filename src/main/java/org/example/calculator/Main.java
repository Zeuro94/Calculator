package org.example.calculator;

import org.example.calculator.print.*;
import org.example.calculator.process.*;
import org.example.calculator.read.*;
import org.example.calculator.validation.*;


public class Main {

    public static void main(String[] args) {

        IRead readFromConsole = new ReadFromConsole();

        IMathEq mathEq = new MathEq();

        IPrint iPrintOnConsole = new PrintOnConsole();

        IValidate iValidate = new Validation();

        long a;
        long b;

        String firstNumber;
        String secondNumber;

          do {
            firstNumber = readFromConsole.readValue();
            secondNumber = readFromConsole.readValue();
        } while (
                (!iValidate.tryParseLong(firstNumber)) || (!iValidate.tryParseLong(secondNumber))

        );
        a = Long.parseLong(firstNumber);
        b = Long.parseLong(secondNumber);


        String option = readFromConsole.readOperation();

        double result = mathEq.calculate(a, b, option);
        iPrintOnConsole.print(result);
    }
}