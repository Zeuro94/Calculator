package org.example;

import org.example.calculator.print.PrintOptions;
import org.example.calculator.print.PrintOnConsole;

public class Main {

    public static void main(String[] args) {
        PrintOptions printOptions = new PrintOptions();
        printOptions.print();
        PrintOnConsole printOnConsole = new PrintOnConsole();
        printOnConsole.print();
    }
}