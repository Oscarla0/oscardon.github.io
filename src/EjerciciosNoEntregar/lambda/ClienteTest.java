package EjerciciosNoEntregar.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClienteTest {

    public static void  main(String[] args) {
        
    
     Clientes cli1 = new Clientes("Juan", "Jose", 24);
     Clientes cli2 = new Clientes("Oscar", "yE", 20);
     Clientes cli3 = new Clientes("Ale", "Martinez", 21);
     Clientes cli4 = new Clientes("Dani", "Garcia", 22);
     Clientes cli5 = new Clientes("Victor", "Rey", 23);

     //Incluir los clientes en una lista
     List<Clientes> listaCliPrueba2 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
     List<Clientes> listaCliPrueba1 = new ArrayList<Clientes>();
     listaCliPrueba1.add(cli1);
     listaCliPrueba1.add(cli2);
     listaCliPrueba1.add(cli3);
     listaCliPrueba1.add(cli4);
     listaCliPrueba1.add(cli5);
     System.out.println("Lista de Clientes antes de ordenar = "+listaCliPrueba1);
     listaCliPrueba1.sort(new ClienteEdadComparator());
     System.out.println ("/nLista de clientes Despues de ordenar = "+listaCliPrueba1);
     /*Solucion2 con inner class */
        listaCliPrueba2.sort(new Comparator<Clientes>(){

        @Override
        public int compare (Clientes o1,Clientes o2){
                return o1.getEdad() > o2.getEdad() ?1:-1;
        }
            
        
    });
    System.out.println("/nLista de clientes 2 Despues de ordenar = "+listaCliPrueba2);

    //Solucion 3 con java Lambda
    //Expresion lambda suma(A,B)
    List<Clientes> listaCliPrueba3 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
    listaCliPrueba3.sort((Clientes o1, Clientes o2) -> 
    {return o1.getEdad() > o2.getEdad()?1:-1;
   });
   System.out.println("/nLista de clientes 3 Despues de ordenar = "+listaCliPrueba3 );

   //Solucion 4 con java lambda simplificada
   List<Clientes>listaCliPrueba4 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
   
   listaCliPrueba4.sort( (Clientes o1, Clientes o2) -> 
   {return o1.getEdad() > o2.getEdad()?1:-1;});
   System.out.println ("/nLista de clientes 4 Despues de ordenar = "+listaCliPrueba4);

   //Solucion 5 con java lambda super simplificada
   List<Clientes>listaCliPrueba5 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
   listaCliPrueba5.sort((o1,o2) ->  o1.getEdad() > o2.getEdad()?1:-1); 
   System.out.println("\nLista de clientes 5 Despues de ordenar = "+listaCliPrueba5);

   //Ordena por nombre
   List<Clientes> listaCliPrueba6 =Arrays.asList(cli1,cli2,cli3,cli4,cli5);
   listaCliPrueba6.sort((o1,o2) -> o1.getNombre().compareTo(o2.getNombre()));
   System.out.println("\nLista de clientes 6 Despues de ordenar por NOMBRE = "+listaCliPrueba6);
   //Quitar los nombres que empiezan por A
   List<Clientes> listaCliPrueba7 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
   ArrayList<Clientes>lista7Aux = new ArrayList<Clientes>(listaCliPrueba7);
   lista7Aux.removeIf(o1 -> o1.getNombre().startsWith("A"));

   System.out.println ("\nLista de clientes Sin A = "+lista7Aux);

   //quitar los mayores de 30

   List<Clientes> listaCliPrueba8 = Arrays.asList(cli1,cli2,cli3,cli4,cli5);
   ArrayList<Clientes> lista8Aux = new ArrayList<Clientes>(listaCliPrueba8);
   lista8Aux.removeIf( n -> (n.getEdad() > 30));

   System.out.println ("\nLista de clientes Mayores de > 30= "+lista8Aux);



}
}

