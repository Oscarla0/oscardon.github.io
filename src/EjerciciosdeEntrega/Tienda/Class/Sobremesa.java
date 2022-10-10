package EjerciciosdeEntrega.Tienda.Class;

public class Sobremesa extends Ordenador  {

    public Sobremesa(String sCodigo, String aRam, String vCpu, double aPrecio) {
        super(sCodigo, aRam, vCpu, aPrecio);
        //TODO Auto-generated constructor stub
    }

    /*Atributo */
    private String tipo_torre;

    public Sobremesa(String sCodigo, String aRam, String vCpu, double aPrecio, String tipo_torre) {
        super(sCodigo, aRam, vCpu, aPrecio);
        this.tipo_torre = tipo_torre;
    }

    public void mostrarDatosSobremesa(){
        System.out.println("Codigo: "+getsCodigo()+
                            "\nRAM : "+getaRam()+
                            "\nCPU : "+getvCpu()+
                            "\nPrecio : "+getaPrecio()+
                            "\nPeso :"+tipo_torre);
    }
   
}
