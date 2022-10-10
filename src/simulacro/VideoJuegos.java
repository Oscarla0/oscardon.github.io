package simulacro;

public class VideoJuegos extends Padre {
    /*Atributos */
    private double horas_estimadas = 10;
    private String genero;
    private String compañia;
    
    /*Constructores */

    public void Excepto(String titulo, double horas_estimadas, boolean pendiente, boolean en_curso, boolean terminado,
            String genero, String compañia) {
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compañia = compañia;
    }
    public VideoJuegos( String titulo, double horas_estimadas,boolean pendiente, boolean en_curso, boolean terminado, double duracion,
             String genero, String compañia) {
        super(titulo, duracion,pendiente, en_curso, terminado);
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compañia = compañia;
    }
    /*Getters Setters */

    public double getHoras_estimadas() {
        return horas_estimadas;
    }
    public void setHoras_estimadas(double horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
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
    /*metodos */
    public void VideoJuegoss(){
        System.out.println("Titulo = "+getTitulo()+
                             ", Duracion = "+getHoras_estimadas()+
                             ", Pendiente = "+isPendiente()+
                             ", En Curso = "+isEn_curso()+
                             ", Terminado = "+isTerminado()+
                             ", Genero = "+getGenero()+
                             ", Compañia = "+getCompañia());
    }
}
