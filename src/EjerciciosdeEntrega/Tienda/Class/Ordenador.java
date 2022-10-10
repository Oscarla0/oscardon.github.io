package EjerciciosdeEntrega.Tienda.Class;

public class Ordenador {
    /*Atributos */
    private String sCodigo;
    private String aRam;
    private String vCpu;
    private double aPrecio;
    /*Constructor */
    public Ordenador(String sCodigo, String aRam, String vCpu, double aPrecio) {
        this.sCodigo = sCodigo;
        this.aRam = aRam;
        this.vCpu = vCpu;
        this.aPrecio = aPrecio;
    }
    /*Metodos */
    //To String

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(" + sCodigo + ", " + aRam + ","+vCpu+""+aPrecio+")";
    }
    
    /*Getters Setters */
    public String getsCodigo() {
        return sCodigo;
    }
    
    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }
    public String getaRam() {
        return aRam;
    }
    public void setaRam(String aRam) {
        this.aRam = aRam;
    }
    public String getvCpu() {
        return vCpu;
    }
    public void setvCpu(String vCpu) {
        this.vCpu = vCpu;
    }
    public double getaPrecio() {
        return aPrecio;
    }
    public void setaPrecio(double aPrecio) {
        this.aPrecio = aPrecio;
    }



}
