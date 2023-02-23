package org.example;

import org.example.calculator.MathEq;
import org.example.calculator.Print;
import org.example.calculator.ReadValues;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReadValues read = new ReadValues();
        MathEq mathEq = new MathEq();
        Print print = new Print(mathEq, read);
        print.printOptions();
        Scanner scanner = new Scanner(System.in);
        String options = scanner.nextLine();
        print.printResults(options);
    }
}