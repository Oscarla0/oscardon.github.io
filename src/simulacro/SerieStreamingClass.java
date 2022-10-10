package simulacro;

public class SerieStreamingClass extends Padre {
    /*constantes */
    private final static  int NUMERO_DE_TEMPORADAS = 3;
    private final static int SERIE = 50;
    private final static int CAPITULOS =10;
    /*Atributos */
    private int numero_de_temporadas;
    private String genero;
    private String compañia;
    private double duracion;
    
    
    

    /*Constructores */
    

    public void SerieStreaming(String titulo, int numero_de_temporadas) {
        this.numero_de_temporadas = numero_de_temporadas;
    }
    
    public SerieStreamingClass( String titulo, int numero_de_temporadas, double duracion,boolean pendiente, boolean en_curso, boolean terminado,
            String genero, String compañia) {
        super(titulo, duracion,pendiente, en_curso, terminado);
        this.numero_de_temporadas = numero_de_temporadas;
        this.genero = genero;
        this.compañia = compañia;
        
    }

    /*metodos */
    public int getNumero_de_temporadas() {
        return numero_de_temporadas;
    }
    public void setNumero_de_temporadas(int numero_de_temporadas) {
        this.numero_de_temporadas = numero_de_temporadas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCompañia() {
        return compañia;
    }
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    
    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void SerieStreaming(){
        System.out.println("Titulo = "+getTitulo()+
                             ", Duracion = "+getDuracion()+
                             ", Pendiente = "+isPendiente()+
                             ", En Curso = "+isEn_curso()+
                             ", Terminado = "+isTerminado()+
                             ", Genero = "+getGenero()+
                             ", Compañia = "+getCompañia());
    }

    

    
}
