
package retos.reto2;

/**
 *Programa que simula una fila de un servicio
 * @author Cinthia
 * 21/10/2025
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class FilaTortillas {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Creamos una cola (Queue) que almacenará los nombres de los clientes
        // LinkedList se usa porque permite agregar y quitar elementos fácilmente
        Queue<String> fila = new LinkedList<>();
        
        
        int opcion;
 
        //Menú 
        do {
            System.out.println("\n=== Fila de las Tortillas ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cliente sale de la fila");
            System.out.println("4. Terminar servicio");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

            
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.add(nombre);//Se agraga a la cola 
                    System.out.println(nombre + " se agregó a la fila.");
                    mostrarFila(fila);//Llamar al metodo para ver como quedo la fila 
                    break;
                    
                    // Verificamos si la fila no está vacía                    
                case 2:
                    if (!fila.isEmpty()) {
                        // poll() elimina y devuelve el primer elemento de la cola
                        String atendido = fila.poll(); // elimina el primero
                        System.out.println("Se atendió a: " + atendido);
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    mostrarFila(fila);
                    break;
                    
                    case 3:
                    if (!fila.isEmpty()) {
                        System.out.print("Nombre del cliente que se va: ");
                        String salir = sc.nextLine();
                         // remove(nombre) busca y elimina el elemento indicado
                        if (fila.remove(salir)) {
                            System.out.println(salir + " salió de la fila.");
                        } else {
                            System.out.println(salir + " no está en la fila.");
                        }
                    } else {
                        System.out.println("La fila está vacía.");
                    }
                    mostrarFila(fila);
                    break;
                    
                         case 4:
                    System.out.println("\nServicio terminado.");
                    System.out.println("Clientes restantes en la fila: " + fila.size());
                    mostrarFila(fila);
                    break;

                     // Si el usuario pone un número que no es válido
                    default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

 // Método para mostrar la fila actual
    private static void mostrarFila(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("La fila está vacía.");
        } else {
            System.out.println("Fila actual: " + fila);
 }
}


}
