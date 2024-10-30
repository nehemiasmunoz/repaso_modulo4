package com.marvic.modelos;

public class Cliente {
    private String nombre;
    private int edad;

    public Cliente(){} //constructor vacio
    //Constructor con parametros
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{ nombre: "+nombre+",edad: "+edad+"}";
    }
}
