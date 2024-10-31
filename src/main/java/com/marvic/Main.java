package com.marvic;

import com.marvic.modelos.Cliente;
import com.marvic.utilidad.GsonUtilidad;
import com.marvic.utilidad.ManejoArchivo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creacion de cliente de prueba
        Cliente cliente = new Cliente("Nehemias", 24);
        Cliente cliente2 = new Cliente("Alex", 21);
        //llamado a metodo default toString
//        System.out.println(cliente);
        //Escribimos en el archivo clientes.txt de la raiz
        ManejoArchivo.escribir(cliente);
        ManejoArchivo.escribir(cliente2);
        //Leemos los datos almacenados en el archivo clientes.txt
//        ManejoArchivo.leerArchivo();

        //Obtenemos datos desde el archivo
        List<String> datos = ManejoArchivo.obtenerDatosArchivo();
        //Utilizamos la funcion stream para iterar sobre la lista aplicando una funcion para cada objeto
        List<Cliente> clientes = datos.stream()
                .map(dato -> GsonUtilidad.deserializarObjeto(dato, Cliente.class))
                .toList();
        //Imprimos nuestro datos transformados en clientes
        System.out.println(clientes);


    }
}