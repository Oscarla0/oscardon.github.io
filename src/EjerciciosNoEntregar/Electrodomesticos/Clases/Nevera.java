package EjerciciosNoEntregar.Electrodomesticos.Clases;

public class Nevera extends Electrodomestivos {
    /*Constantes */
    
    /*Atributos */
    private double capacidadFrigorifico;
    private double capacidadCongelador;
    private double sonoridad;
    /*Constructores */
    public Nevera(String marca, String modelo, double precio, String color, double potencia, double horas,
            int utilizacion_dias, double precio_de_energia, double capacidadFrigorifico, double capacidadCongelador,
            double sonoridad) {
        super(marca, modelo, precio, color, potencia, horas, utilizacion_dias, precio_de_energia);
        this.capacidadFrigorifico = capacidadFrigorifico;
        this.capacidadCongelador = capacidadCongelador;
        this.sonoridad = sonoridad;
    }
    /*Getters Setters */
    public double getCapacidadFrigorifico() {
        return capacidadFrigorifico;
    }
    public void setCapacidadFrigorifico(double capacidadFrigorifico) {
        this.capacidadFrigorifico = capacidadFrigorifico;
    }
    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }
    public void setCapacidadCongelador(double capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }
    public double getSonoridad() {
        return sonoridad;
    }
    public void setSonoridad(double sonoridad) {
        this.sonoridad = sonoridad;
        
    }
    /*Metodos */
    public double ConsumoAnual() {
        double consumo = super.ConsumoAnual();
        if(capacidadFrigorifico>=300)
        consumo=consumo+50;
        if(capacidadCongelador>=200)
        consumo=consumo+50;
        // TODO Auto-generated method stub
        return consumo;
    }
}
