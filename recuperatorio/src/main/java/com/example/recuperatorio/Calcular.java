package com.example.recuperatorio;

public interface Calcular {

    default String Calcular(int entero){
        int i,fact=1;
        for(i=1;i<=entero;i++){
            fact=fact*i;
        }
        return "Factorial of "+entero+" is: "+fact;
    }
}
