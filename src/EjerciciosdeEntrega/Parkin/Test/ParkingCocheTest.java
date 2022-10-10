package EjerciciosdeEntrega.Parkin.Test;

import EjerciciosdeEntrega.Parkin.Class.parkingvehiculo;
import EjerciciosdeEntrega.Parkin.Class.vehiculo;

public class ParkingCocheTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando el parking");
        try{
            vehiculo Lamborgini= new vehiculo("4528PLE");
            vehiculo BWM=new vehiculo("8521QWE");
            vehiculo citroen=new vehiculo("9632RDF");
            vehiculo seat=new vehiculo("1234ASDF");
            vehiculo porsche=new vehiculo("8546WSXC");
            parkingvehiculo parking1=new parkingvehiculo("PLAZA ELIPTICA 1,USERA", 80);
            parking1.aparcaCoche(Lamborgini);
            parking1.aparcaCoche(BWM);
            parking1.aparcaCoche(porsche);
            parking1.aparcaCoche(citroen);
            parking1.aparcaCoche(seat);
            Thread.sleep(120*1000);
            parking1.sacaCoche(porsche);
            parking1.sacaCoche(BWM);
            Thread.sleep(60*1000);
            parking1.sacaCoche(Lamborgini);
            parking1.sacaCoche(citroen);
            Thread.sleep(60*1000);
            parking1.sacaCoche(seat);
            double dFacturaP=parking1.getFactura(porsche);
            double dFacturaB=parking1.getFactura(BWM);
            double dFacturaL=parking1.getFactura(Lamborgini);
            double dFacturaC=parking1.getFactura(citroen);
            double dFacturaS=parking1.getFactura(seat);
            System.out.println("El porsche debe pagar="+dFacturaP+
                                "\nEl mazda debe pagar="+dFacturaB+ 
                                "\nEl opel debe pagar="+dFacturaL+
                                "\nEl citroen debe pagar="+dFacturaC+ 
                                "\nEl seat debe pagar="+dFacturaS);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
