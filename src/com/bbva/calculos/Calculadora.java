package com.bbva.calculos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

    public int suma(int num1, int num2){
        return num1 + num2;
    }

    public float suma(float num1, float num2){
        return num1 + num2;
    }

    public BigDecimal suma(BigDecimal num1, BigDecimal num2){
        BigDecimal resultado = num1.add(num2);
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }

    public int resta(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicacion(int num1, int num2){
        return num1 * num2;
    }

    public int division(int num1, int num2){
        return num1 / num2;
    }
}
