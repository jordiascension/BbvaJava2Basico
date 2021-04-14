package com.bbva.numpares;

import java.time.Duration;
import java.time.Instant;

public class Principal {

    public static void main(String[] args) {
        int array[] = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int resultado = calcularNumerosPares(array);

        System.out.println("El número de números pares es " + resultado);
    }

    public static int calcularNumerosPares(int[] numeros) {
        Instant start = Instant.now();
        int numerosPares = 0;
        int i=0;

        while ( i < numeros.length){
            if (numeros[i] % 2 == 0) {
                numerosPares++;
            }
            i++;
        }

        Instant finish = Instant.now();
        long timeElapse = Duration.between(start,finish).toMillis();

        System.out.println("La duración del método es " + timeElapse);

        return numerosPares;
    }
}
