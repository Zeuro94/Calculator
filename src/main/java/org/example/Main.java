package org.example;

import org.example.calculator.print.IPrint;
import org.example.calculator.print.PrintOptions;
import org.example.calculator.print.PrintOnConsole;

public class Main {

    public static void main(String[] args) {

        IPrint printOptions = new PrintOptions();
        printOptions.print();

        IPrint iPrintOnConsole = new PrintOnConsole();
        iPrintOnConsole.print();

    }
}