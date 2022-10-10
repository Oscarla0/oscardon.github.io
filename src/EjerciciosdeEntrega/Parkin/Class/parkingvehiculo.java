package EjerciciosdeEntrega.Parkin.Class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class parkingvehiculo implements parking {
    private static final double PRECIO_MIN=0.0425;
    private static final int MAXIMO_PLAZAS=100;
    private String direccion;
    private int plazas_actuales;

    public parkingvehiculo(String paramdireccion, int paramplazasactuales) {
        this.direccion = paramdireccion;
        this.plazas_actuales = paramplazasactuales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazas_actuales() {
        return plazas_actuales;
    }

    public void setPlazasactuales(int plazasactuales) {
        this.plazas_actuales = plazasactuales;
    }

    @Override
    public boolean Plazas() {
        if(getPlazas_actuales()<MAXIMO_PLAZAS){
            return true;
        }
        else{
            return false;
        }
    }

    
    @Override
    public void aparcaCoche(vehiculo coche) throws Exception {
        if(Plazas()){
             plazas_actuales++;
             coche.setlFechaIni(LocalDateTime.now());
        }else{
            throw new Exception("Parking lleno");
        }
        
        
    }

    @Override
    public void sacaCoche(vehiculo coche) throws Exception{
        if(coche.getlFechaIni()!=null){
            plazas_actuales--;
            coche.setlFechaFin(LocalDateTime.now());
       }else{
           throw new Exception("Error, te has confundido de parking");
       }
        
    }

    @Override
    public double getFactura(vehiculo coche) throws Exception{
        double pagar;
       if(coche.getlFechaFin()!=null){
         pagar=/*java.time.temporal.ChronoUnit.MINUTES.between() */
         (ChronoUnit.MINUTES.between(coche.getlFechaIni(), coche.getlFechaFin()))*PRECIO_MIN;
        
       }else{
        throw new Exception("ERROR en la Factura");
       }
        return pagar;
    }

   
    
}
