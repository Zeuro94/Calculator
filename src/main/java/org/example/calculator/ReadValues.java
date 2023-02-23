package org.example.calculator;

import java.util.Scanner;

public class ReadValues {
    Scanner scanner = new Scanner(System.in);

    String getFirstValue() {
        System.out.println("Primul numar");
        return scanner.nextLine();
    }

    String getSecondValue() {
        System.out.println("Al doilea numar");
        return scanner.nextLine();
    }
}
