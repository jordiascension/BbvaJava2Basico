package com.bbva.menu;

public class Menu {

    //Atributos
    private String entrante;
    private String primero;
    private String segundo;
    private String postre;
    private String bebida;
    private boolean incluyePan;
    private boolean incluyeCafe;
    float precio;

    //Métodos getter & setter
    public String getEntrante() {
        return entrante;
    }

    public void setEntrante(String entrante) {
        this.entrante = entrante;
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public boolean isIncluyePan() {
        return incluyePan;
    }

    public void setIncluyePan(boolean incluyePan) {
        this.incluyePan = incluyePan;
    }

    public boolean isIncluyeCafe() {
        return incluyeCafe;
    }

    public void setIncluyeCafe(boolean incluyeCafe) {
        this.incluyeCafe = incluyeCafe;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Constructores
    public Menu(){

    }

    public Menu(String entrante, String primero, String segundo){
        this.entrante = entrante;
        this.primero = primero;
        this.segundo = segundo;
    }

    public Menu(String entrante, String primero, String segundo, String postre,
                String bebida, boolean incluyePan, boolean incluyeCafe,
                float precio){
        this.entrante = entrante;
        this.primero = primero;
        this.segundo = segundo;
        this.postre = postre;
        this.bebida = bebida;
        this.incluyeCafe = incluyeCafe;
        this.incluyePan = incluyePan;
        this.precio = precio;
    }

    public void mostrarMenu(){
        String msgIncluyePan;
        String msgIncluyeCafe;

        if(this.incluyePan){
            msgIncluyePan = "El menú incluye Pan";
        }else{
            msgIncluyePan = "El menú no incluye Pan";
        }

        if(this.incluyeCafe){
            msgIncluyeCafe = "El menú incluye Cafe";
        }else{
            msgIncluyeCafe = "El menú no incluye Cafe";
        }

        System.out.println("El menú se compone de:\n" +
                            "Entrante - " + entrante + "\n" +
                            "Primero - " + primero + "\n" +
                            "Segundo - " + segundo + "\n" +
                            "Postre - " + postre + "\n" +
                            "Bebida - " + bebida + "\n" +
                            "Precio - " + precio + "\n");
    }
}
