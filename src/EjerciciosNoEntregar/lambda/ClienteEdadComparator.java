package EjerciciosNoEntregar.lambda;

import java.util.Comparator;

public class ClienteEdadComparator implements Comparator <Clientes> {

    @Override
    public int compare(Clientes o1, Clientes o2) {
        // Si A>B devolver 1, si A=B 0 , si no -1
        return o1.getEdad()>o2.getEdad()?1:-1;
    
    }
    
    
}
