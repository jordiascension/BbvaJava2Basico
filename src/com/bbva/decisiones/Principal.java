package com.bbva.decisiones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //variables de ámbito de método
        int num1, num2;
        //regla 30 * 30 * 30 * 30 (30 packages * 30 clases * 30 metodos * 30 lineas de código)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextInt();

        entrada.close();

        if(num1 > num2) {
            System.out.println("El primer número es mayor que el segundo número");
        }else{
            System.out.println("El segundo número es mayor que el primer número");
        }
    }
}
