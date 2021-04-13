package com.bbva.calculos;

import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        //Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora();
        System.out.println("La suma es " + calculadora.suma(2,2));

        System.out.println("La suma es " + calculadora.suma(2055.55f,2.34f));

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        System.out.println("La suma con formato es " +
                decimalFormat.format(calculadora.suma(2000.55f,2.34f)));

        System.out.println("La resta es " + calculadora.resta(4,2));

        System.out.println("La multiplicación es " + calculadora.multiplicacion(2,2));

        System.out.println("La división es " + calculadora.division(2,2));
    }
}
