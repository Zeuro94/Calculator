package org.example.calculator.print;


public class PrintOnConsole implements IPrint {

    @Override
    public void print(double result) {
        System.out.println(result);
    }

}

