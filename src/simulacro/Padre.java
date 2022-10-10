package simulacro;

public class Padre {
    private String titulo;
    private double duracion;
    private boolean pendiente = false;
    private boolean en_curso = false;
    private boolean terminado = false;
    


    public Padre( String titulo, double duracion,boolean pendiente, boolean en_curso, boolean terminado) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.pendiente = pendiente;
        this.en_curso = en_curso;
        this.terminado = terminado;
        
    }
    public boolean isPendiente() {
        return pendiente;
    }
    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }
    public boolean isEn_curso() {
        return en_curso;
    }
    public void setEn_curso(boolean en_curso) {
        this.en_curso = en_curso;
    }
    public boolean isTerminado() {
        return terminado;
    }
    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
