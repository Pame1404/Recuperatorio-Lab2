package com.example.recuperatorio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese entero: ");
        int numero = reader.nextInt();
        Factorial factorial = new Factorial(numero);
        System.out.println(factorial.mostrarString(numero));
//        System.out.println(factorial.Calcular(numero));
    }
}
