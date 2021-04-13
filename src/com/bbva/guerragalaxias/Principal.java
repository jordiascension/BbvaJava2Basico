package com.bbva.guerragalaxias;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("\nEJERCICIO 2");

        Jedi lukeSkywalker = new Jedi("Luke Skywalker", "azul");
        Jedi maceWindu = new Jedi("Mace Windu", "morado");
        Jedi yoda = new Jedi("Yoda", "verde");
        Jedi quigonJinn = new Jedi("Qui-Gon Jinn", "verde");
        Jedi obiwanKenobi = new Jedi("Obi-Wan Kenobi", "azul");

        lukeSkywalker.mostrar();
        maceWindu.mostrar();
        yoda.mostrar();
        quigonJinn.mostrar();
        obiwanKenobi.mostrar();
    }
}
