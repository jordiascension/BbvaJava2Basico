package com.bbva.menu;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu("Entrante","Primero","Segundo");
        menu.mostrarMenu();

        Menu menu1 = new Menu("Entrante","Primero","Segundo",
                               "Postre","Bebida",true,true,
                                12);
        menu1.mostrarMenu();

        Menu menu2 = new Menu();
        menu2.setEntrante("Entrante");
        menu2.setPrimero("Primero");
        menu2.mostrarMenu();
    }
}
