package EjerciciosNoEntregar.Interfaces;

public class Timbre implements Sonido {

    @Override
    public void EmitirSonido() {
        System.out.println(sonidoFavorito);
        String sonidoFavorito=new String ("Otro");
        System.out.println("RIng ring ring");
    }
    
    
}
