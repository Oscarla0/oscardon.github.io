package EjerciciosNoEntregar.Interfaces;

interface Sonido {
    
    String sonidoFavorito = new String ("Olas");
    void EmitirSonido();

    default void silencio (){
        System.out.println("********************");
    }

    
    
}
