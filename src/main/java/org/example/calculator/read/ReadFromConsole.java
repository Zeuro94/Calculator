package org.example.calculator.read;

import java.util.Scanner;

public class ReadFromConsole implements IRead {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String readValue() {
        return scanner.nextLine();
    }

    @Override
    public String readOperation() {
        System.out.println("Selecteaza operatia matematica:");
        System.out.println("1. Adunare ");
        System.out.println("2. Scadere");
        System.out.println("3. Impartire");
        System.out.println("4. Inmultire");

        return scanner.nextLine();
    }
}


