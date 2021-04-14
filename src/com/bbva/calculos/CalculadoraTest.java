package com.bbva.calculos;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.suma(2,2)==4);
    }

    @org.junit.jupiter.api.Test
    void resta() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.resta(2,2)==0);
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.multiplicacion(2,4)==8);
    }

    @org.junit.jupiter.api.Test
    void division() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.division(8,4)==2);
    }

    @Test
    public void sumaBigDecimalTest(){
        Calculadora calculadora=new Calculadora();
        BigDecimal resultado= new BigDecimal("2.94");

        resultado.setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(calculadora.suma(new BigDecimal("1.505"), new BigDecimal("1.440")),resultado);
    }
}