package EjerciciosNoEntregar.Interfaces;

public class Gato implements Sonido {

    @Override
    public void EmitirSonido() {
        // TODO Auto-generated method stub
        System.out.println("RIng ring ring");
    }
    @Override
    public void silencio(){
        System.out.println("rrrrrrrrrr");
    }
    
}
