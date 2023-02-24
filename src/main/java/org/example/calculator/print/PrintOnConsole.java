package org.example.calculator.print;

import org.example.calculator.process.IMathEq;
import org.example.calculator.process.MathEq;
import org.example.calculator.read.IRead;
import org.example.calculator.read.ReadFromKeyboard;

import java.util.Scanner;

public class PrintOnConsole implements IPrint {

    IMathEq iMathEq = new MathEq();
    IRead iread = new ReadFromKeyboard();

    @Override
    public void print() {
        printResults(new Scanner(System.in).nextLine());
    }

    private void printResults(String option) {

        switch (option) {
            case "1" -> System.out.println(iMathEq.add(Double.parseDouble(iread.readvalue()), Double.parseDouble(iread.readvalue())));
            case "2" -> System.out.println(iMathEq.subtract(Double.parseDouble(iread.readvalue()), Double.parseDouble(iread.readvalue())));
            case "3" -> System.out.println(iMathEq.multiply(Double.parseDouble(iread.readvalue()), Double.parseDouble(iread.readvalue())));
            case "4" -> System.out.println(iMathEq.divide(Double.parseDouble(iread.readvalue()), Double.parseDouble(iread.readvalue())));
            default -> System.out.println("Operatie invalida");
        }
    }
}

