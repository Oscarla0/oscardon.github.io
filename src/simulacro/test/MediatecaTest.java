package simulacro.test;

import java.util.TreeSet;

import simulacro.SerieStreamingClass;
import simulacro.VideoJuegos;

public class MediatecaTest {

    private boolean aPendiente = true;
    private boolean empezar = true;
    private boolean iniciador = true;
    private boolean finalizar = true;
    public static void main ( String [] args){
        SerieStreamingClass serie1 = new SerieStreamingClass("Titulo ", 2, 120, false, false, false, "Netflix", "China");
        serie1.SerieStreaming();
        SerieStreamingClass serie2 = new SerieStreamingClass("Pokemon", 2, 120, false, false, false, "Animation", "Tokyo");
        serie2.SerieStreaming();
        SerieStreamingClass serie3 = new SerieStreamingClass("Arcane", 2, 120, false, false, false, "Animation", "Riot");
        serie3.SerieStreaming();
        VideoJuegos v1 = new VideoJuegos("league of legends", 0.5, false, false, false, 0, "Dota", "Riot");
        v1.VideoJuegoss();
        VideoJuegos v2 = new VideoJuegos("Valorant", 0.5, false, false, false, 0,"Fps", "Riot");
        v2.VideoJuegoss();
        VideoJuegos v3 = new VideoJuegos("OverWatch", 0.7, false, false, false, 0, "Fps", "Blizzart");
        v3.VideoJuegoss();


        /*Cambia una serie a pendiente */
        serie1.isPendiente();
        /*Cambiar un videojuego a finalizado */
        v1.isTerminado();
        /*Cambia una serie a empezada */
        serie2.isEn_curso();
        /*Cambia un juego a empezado */
        v2.isEn_curso();



        TreeSet<Object> miLista = new TreeSet<>();

        miLista.add(serie1);
        miLista.add(serie2);
        miLista.add(serie3);
        miLista.add(v1);
        miLista.add(v2);
        miLista.add(v3);

        System.out.println("Total "+miLista);



    }
}
