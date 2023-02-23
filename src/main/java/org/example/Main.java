package org.example;

import org.example.calculator.Operation;
import org.example.calculator.Print;
import org.example.calculator.ReadValues;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReadValues read = new ReadValues();
        Operation operation = new Operation();
        Print print = new Print(operation, read);
        print.printOptions();
        Scanner scanner = new Scanner(System.in);
        String options = scanner.nextLine();
        print.options(options);
    }
}