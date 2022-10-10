package Tema2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CalculaNumeros {
    public static void main (String [] args){
        final String RUTA_FICH="C:\\Users\\Oscar\\Desktop\\eQUISDE\\";
        String sCadena = "Texto a escribir en el fichero";
            //Opcion 1 java.io
        try (FileWriter writer = new FileWriter(RUTA_FICH+"info.log");
                BufferedWriter bw = new BufferedWriter(writer)){
                    bw.write(sCadena);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Fin fichero info.log");
        //java.nio
        Path path= Paths.get(RUTA_FICH+"info2.log");

        try {
            Files.write(path,sCadena.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Fin fichero info2.log");
        }
        
    }

