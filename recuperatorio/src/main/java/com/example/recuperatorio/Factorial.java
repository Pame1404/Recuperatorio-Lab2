package com.example.recuperatorio;

public class Factorial extends Operaciones implements Calcular {

    int entero;

    public Factorial(int entero) {
        super(entero);
        this.entero = entero;
    }
//
//    public String Calcular(int entero){
//        return Calcular(entero);
//    }

    public String mostrarString(int entero){
        entero = this.entero;
        int iFactorial = 1;
        String sCadena = Integer.toString(entero) + "! = 1";
        for (int x=2;x<=entero;x++) {
            iFactorial = iFactorial * x;
            sCadena = sCadena + " x " + Integer.toString(x);
        }
        return sCadena + " = " + Integer.toString(iFactorial);
    }


}
