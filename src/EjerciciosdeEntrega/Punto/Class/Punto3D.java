package EjerciciosdeEntrega.Punto.Class;

public class Punto3D extends Punto {
    /*Atributos */
        protected int z;
    
    
    @Override
        public boolean equals(Object obj) {

            return super.equals(obj);
        }
        /*Constructores */
        public Punto3D(int iX, int iY, int z) {
        super(iX, iY);
        this.z = z;
    }
        public Punto3D(int iX, int iY) {
            super(iX, iY);
        }
        /*Getters */
        public int getiZ() {
            return z;
        }
    /*Metodo */
        public double dDistancia(Punto otroPunto) {
            double x1 = x - otroPunto.getx();
            double y1 = y - otroPunto.gety();
            double z1 = z - otroPunto.getiZ();
            return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
          }
    
    }