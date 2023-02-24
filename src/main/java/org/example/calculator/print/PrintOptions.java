package org.example.calculator.print;

public class PrintOptions implements IPrint {
    @Override
    public void print() {
        System.out.println("Selecteaza operatia matematica:");
        System.out.println("1. Adunare ");
        System.out.println("2. Scadere");
        System.out.println("3. Impartire");
        System.out.println("4. Inmultire");
    }
}
