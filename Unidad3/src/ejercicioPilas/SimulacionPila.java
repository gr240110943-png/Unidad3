
package ejercicioPilas;

import java.util.Arrays;

/**
 *Clase qu eme permite verificar mis operaciones con la pila
 * @author Cinthia
 */
public class SimulacionPila {
    
    public static void main(String[] args) {
        
            MiStack miPila = new MiStack(4);
            miPila.push("Uno");
            miPila.push("Dos");
            
            System.out.println("Valor que esta en el tope "+miPila.peek());
            
            System.out.println("Todos los valores" + Arrays.toString(miPila.viewStack()));
    }
    
}
