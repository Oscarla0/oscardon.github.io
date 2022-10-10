package Tema2;

import java.io.File;
import java.util.Arrays;

public class EjemploDir {
    public static void main(String[]args){
        /*Listado de ficheros del directorio actual */
        File miDir = new File(".");
        String [ ]archivos = miDir.list();
        System.out.println(archivos);
        for (int i=0; i<archivos.length ; i++){
            System.out.println(archivos[i]);
        }
        //for-each
        for (String elem:archivos){
            System.out.println(elem);
        }
        System.out.println("\n*********con lambda****");
        Arrays.asList(archivos).forEach(System.out::println);
    }
}
