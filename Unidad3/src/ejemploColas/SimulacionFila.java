
package ejemploColas;

import java.util.Arrays;

/**
 *
 * @author Cinthia
 */
public class SimulacionFila {
 
    public static void main (String[] args){

MiFila fila = new MiFila(5);

fila.offer("a");
fila.offer("b");
fila.offer("c");


    System.out.println("Valores: " + Arrays.toString(fila.aArreglo()));

        System.out.println("Atendido " + fila.poll());
    System.out.println("Valores: " + Arrays.toString(fila.aArreglo()));

}
    
}

