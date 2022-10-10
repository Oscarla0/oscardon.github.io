package EjerciciosNoEntregar.Electrodomesticos.Clases;

public class Electrodomestivos {
    /*Constantes */
    protected static final String MARCA_BASE="bosch";
    protected static final String MODELO_BASE="7200";
    protected static final double PRECIO_ELECTRO_BASE=400;
    protected static final String COLOR_BASE="gris";
    protected static final double POTENCIA_BASE=2300;
    protected static final int HORAS_BASE=1;
    protected static final int DIAS_BASE=3;
    protected static final double PRECIO_ENERGIA_BASE=0.40397;
    /*Atributos */
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private double potencia;
    private double horas;
    private int utilizacion_dias;
    private double precio_de_energia;
    /*Constructor Base */
    public Electrodomestivos(){
        this(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ELECTRO_BASE);
    }
    
    /*Constructores */
    public Electrodomestivos(String marca, String modelo, double precio, String color, double potencia, double horas,
            int utilizacion_dias, double precio_de_energia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.potencia = potencia;
        this.horas = horas;
        this.utilizacion_dias = utilizacion_dias;
        this.precio_de_energia = precio_de_energia;
    }
    
    /*Metodos */
    public double ConsumoAnual(){
        return(this.potencia/1000)*horas*utilizacion_dias*precio;
    }

    @Override
    public String toString(){
        return"Electrodom [Potencia = "+potencia+ ", "+precio_de_energia+",precio "+precio_de_energia;
    }
    /*Getters y Setters */
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public int getUtilizacion_dias() {
        return utilizacion_dias;
    }
    public void setUtilizacion_dias(int utilizacion_dias) {
        this.utilizacion_dias = utilizacion_dias;
    }
    public double getPrecio_de_energia() {
        return precio_de_energia;
    }
    public void setPrecio_de_energia(double precio_de_energia) {
        this.precio_de_energia = precio_de_energia;
    }
    /*Subclase */
    public class Nevera {
        private String frigorifico;
        private String congelador;
        private double sonoridad;
        /*Constructor */
        public Nevera(String frigorifico, String congelador, double sonoridad) {
            this.frigorifico = frigorifico;
            this.congelador = congelador;
            this.sonoridad = sonoridad;
        }
        /*Getter Setters */
        public String getFrigorifico() {
            return frigorifico;
        }
        public void setFrigorifico(String frigorifico) {
            this.frigorifico = frigorifico;
        }
        public String getCongelador() {
            return congelador;
        }
        public void setCongelador(String congelador) {
            this.congelador = congelador;
        }
        public double getSonoridad() {
            return sonoridad;
        }
        public void setSonoridad(double sonoridad) {
            this.sonoridad = sonoridad;
        }

    }


}
