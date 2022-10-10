package EjerciciosdeEntrega.Punto.Class;

    public class Punto {
        /*Atributos */
        protected int x;
        protected int y;
       
        
        /*Constructor */
        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getx() {
            return x;
          }
        
          public int gety() {
            return y;
          }
          /*METODO  */
        public double dDistancia(Punto otroPunto) {
            double x1 = x - otroPunto.gety();
            double y1 = y - otroPunto.gety();
            return Math.sqrt(x1 * x1 + y1 * y1);
          }
          @Override
        public boolean equals(Object obj) {
          
          return super.equals(obj);
        }
        public int getiZ() {
          return 0;
        }
    
      
    }

