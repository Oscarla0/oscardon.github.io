package Tema2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFileReader2 {
    public static void main (String [] args){
        final String RUTA_FICH="C:\\Users\\Oscar\\Desktop\\eQUISDE\\";
        String sTexto ="";
        try (BufferedReader brIn = new BufferedReader(new FileReader(RUTA_FICH+"prueba.txt"))) {
            sTexto=brIn.readLine();
            while (sTexto!=null){
                System.out.println(sTexto);
                sTexto = brIn.readLine();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
