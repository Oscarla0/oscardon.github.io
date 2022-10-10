package Tema2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFileReader {
    public static void main (String [] args){
        final String RUTA_FICH="C:\\Users\\Oscar\\Desktop\\eQUISDE";
        String sTexto ="";
        BufferedReader brIn= null;
        try {
            FileReader frIn = new FileReader(RUTA_FICH+"prueba.txt");
            brIn = new BufferedReader(frIn);
            sTexto = brIn.readLine();
            while (sTexto!=null){
                System.out.println(sTexto);
                sTexto= brIn.readLine();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            if(brIn!=null)
            try {
                brIn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
    }
}
