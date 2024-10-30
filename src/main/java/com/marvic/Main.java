package com.marvic;

import com.marvic.modelos.Cliente;
import com.marvic.utilidad.ManejoArchivo;

public class Main {
    public static void main(String[] args) {
        //creacion de cliente de prueba
        Cliente cliente = new Cliente("Nehemias", 24);
        //llamado a metodo default toString
        System.out.println(cliente);
        //Escribimos en el archivo clientes.txt de la raiz
        ManejoArchivo.escribir(cliente);
        //Leemos los datos almacenados en el archivo clientes.txt
        ManejoArchivo.leerArchivo();
    }
}