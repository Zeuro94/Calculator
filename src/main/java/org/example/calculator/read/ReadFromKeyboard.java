package org.example.calculator.read;

import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard implements IRead {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String readvalue() {
        return scanner.nextLine();
    }

}
