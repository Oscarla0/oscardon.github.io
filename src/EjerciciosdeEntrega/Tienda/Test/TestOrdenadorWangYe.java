package EjerciciosdeEntrega.Tienda.Test;

import EjerciciosdeEntrega.Tienda.Class.Portatil;
import EjerciciosdeEntrega.Tienda.Class.Sobremesa;

public class TestOrdenadorWangYe {
    public static void main(String[] args){
        Portatil portatil = new Portatil("nuasdll", "32GB", "i123456", 777,564);
        portatil.mostrarDatosPortatil();
        Sobremesa sobremesa = new Sobremesa("654891","64GB", "i20778820k", 7777,"Oscadon");
        sobremesa.mostrarDatosSobremesa();
    }
}

