package com.bbva.guerragalaxias;

public class Jedi {

    String nombre;
    String colorSableLuz;

    public Jedi(String nombre, String colorSableLuz) {
        this.nombre = nombre;
        this.colorSableLuz = colorSableLuz;
    }

    public void mostrar() {
        System.out.println("Soy un Jedi, mi nombre es " + this.nombre +
                " y el color de mi sable de luz es " + this.colorSableLuz);
    }
}

