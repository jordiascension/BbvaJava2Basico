package com.bbva.num;

import java.time.Duration;
import java.time.Instant;

public class Principal {

    public static void main(String[] args) {
        int array[] = new int[1000000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int resultado = calcularNumeroMayor(array);
        System.out.println("El número mayor es " + resultado);
    }

    private static int calcularNumeroMayor(int[] enteros) {
        Instant start = Instant.now();
        int numeroMayor = 0;

        for (int entero : enteros) {
            if(numeroMayor < entero){
                numeroMayor = entero;
            }
        }

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        System.out.println("La duración del método calcularNumeroMayor es " + timeElapsed);
        return numeroMayor;
    }
}
