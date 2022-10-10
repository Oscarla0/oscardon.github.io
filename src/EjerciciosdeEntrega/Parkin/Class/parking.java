package EjerciciosdeEntrega.Parkin.Class;

interface parking {
    public boolean Plazas();
    public void aparcaCoche(vehiculo coche) throws Exception;
    public void sacaCoche(vehiculo coche) throws Exception;
    public double getFactura(vehiculo coche) throws Exception;

}
