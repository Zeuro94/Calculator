package org.example;

import org.example.calculator.print.IPrint;
import org.example.calculator.print.PrintOnConsole;
import org.example.calculator.process.IMathEq;
import org.example.calculator.process.MathEq;
import org.example.calculator.read.IRead;
import org.example.calculator.read.ReadFromConsole;
import org.example.calculator.validation.IValidate;
import org.example.calculator.validation.Validation;

public class Main {

    public static void main(String[] args) {

        IRead readFromConsole = new ReadFromConsole();

        IMathEq mathEq = new MathEq();

        IPrint iPrintOnConsole = new PrintOnConsole();

        IValidate iValidate = new Validation();


        double a = 0;
        double b = 0;

        String firstNumber;
        String secondNumber;


        do {
            firstNumber = readFromConsole.readValue();
            iValidate.checkIfIsAValidNumber(firstNumber);
            secondNumber = readFromConsole.readValue();
            iValidate.checkIfIsAValidNumber(secondNumber);
        }
        while (!iValidate.checkIfIsAValidNumber(firstNumber));{
            firstNumber = readFromConsole.readValue();
            a = Double.parseDouble(firstNumber);
        }

        b = Double.parseDouble(secondNumber);

        String option = readFromConsole.readOperation();

        double result = mathEq.calculate(a, b, option);

        iPrintOnConsole.print(result);

    }
}