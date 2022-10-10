package EjerciciosNoEntregar.Electrodomesticos.Clases;

public class Television extends Electrodomestivos {
    
    /*Constantes */
    private static final int RESOLUCION_BASE=30;

    /*Atributos */
    private int resolucion;
    /*Constructores */
    public Television (){
        this(RESOLUCION_BASE);
    }
    public Television (int paramResolucion){
        super(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ELECTRO_BASE);
        this.resolucion= paramResolucion;
    }
    /*Metodos */
    @Override
    public double ConsumoAnual() {
        double consumo = super.ConsumoAnual();
        if(resolucion>50)
            consumo+=50;
        // TODO Auto-generated method stub
        return consumo;
    }
    
    
}
