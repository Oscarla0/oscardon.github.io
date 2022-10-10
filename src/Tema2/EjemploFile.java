package Tema2;

import java.io.File;

public class EjemploFile {
    final static String RUTA_FICH = "C:\\Users\\Oscar\\Desktop\\eQUISDE";
    public static void main (String [] args){
        File fich1 = new File("c:prueba.txt");
    // Constructor con ruta+nombre
    File fich2 = new File(RUTA_FICH,"prueba.txt");
    //constructor con FILE +nombre
    File direc= new File(RUTA_FICH);
    File fich3 = new File (direc, "prueba2.txt");
    
    //Constructor con String
    /*Ver informacion del fichero */

    System.out.println("Ruta del fichero "+fich2.getPath() );
    System.out.println("Ruta Absoluta "+fich2.getAbsolutePath() );
    System.out.println("Se puede leer "+fich2.canRead() );
    System.out.println("Tamaño"+fich2.length() );
    System.out.println("Directorio?"+fich2.isDirectory() );
    System.out.println("Fichero?"+fich2.isFile() );
    

}
}
