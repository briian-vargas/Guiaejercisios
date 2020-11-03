package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numeroA; float numeroB; float suma; float resta; float multiplicacion; float division;

        System.out.print("Ingrese el primer número: ");
        numeroA = teclado.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        numeroB = teclado.nextFloat();

        suma = numeroA + numeroB;
        resta = numeroA - numeroB;
        multiplicacion = numeroA * numeroB;
        division = numeroA /numeroB;

        System.out.println("La suma de ambos es: "+ (int)suma);
        System.out.println("La resta de ambos es: "+ (int)resta);
        System.out.println("La multiplicación es: "+ (int)multiplicacion);
        System.out.println("La división es : "+ division);





    }
}
