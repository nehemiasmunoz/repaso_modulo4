package com.marvic.utilidad;

import java.io.*;

public class ManejoArchivo {
    //Ruta de archivos que manipularemos
    public static String nombreArchivo = "clientes.txt";


    //Metodo para escribir en archivo
    public static <T> void escribir(T dato){
        try(
                FileWriter fw = new FileWriter(nombreArchivo, true);
                PrintWriter pw = new PrintWriter(fw);
                ) {
            pw.println(dato);
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

    }
    //Metodo para leer el archivo
    public static void leerArchivo(){
        try(
                BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))
        ) {
            String linea = lector.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }
        }catch (IOException e){
            System.out.println("Ocurrio un error al leer el archivo" + e.getMessage());
        }
    }

}
