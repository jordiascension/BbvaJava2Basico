package com.bbva.numpares;
import com.bbva.calculos.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    @org.junit.jupiter.api.Test
    void calcularNumerosParesTest() {
        int array[] = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int resultado = Principal.calcularNumerosPares(array);

        assertTrue(resultado==500);
    }
}
