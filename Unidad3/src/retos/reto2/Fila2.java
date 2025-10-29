
package retos.reto2;

/**
 *
 * @author Cinthia
 */

import java.util.Scanner;

public class Fila2 {
    
 public static void main(String[] args) {
        int opc = 0; 
        Scanner sc  = new Scanner(System.in); 
        System.out.println("Tortillas Tec");
        Persona inicioFila = null; 
        Persona finFila = null;  // Nuevo: para controlar el final de la lista

        do{
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Cliente enojado");
            System.out.println("4. Imprimir en orden inverso");
            System.out.println("5. Terminar servicio");
            System.out.print("Elige una opción: ");
            opc = Integer.parseInt(sc.nextLine()); 
            switch(opc){
                case 1:
                    System.out.print("Dame un nombre: ");
                    String nombre = sc.nextLine(); 
                    Persona personaNueva = new Persona(nombre);

                    System.out.print("¿Agregar al inicio o al final? (i/f): ");
                    char donde = sc.nextLine().toLowerCase().charAt(0);

                    if (inicioFila == null) {
                        // Si la fila está vacía, inicio y fin son el mismo
                        inicioFila = finFila = personaNueva;
                    } else if (donde == 'i') {
                        // Insertar al inicio
                        personaNueva.siguiente = inicioFila;
                        inicioFila.anterior = personaNueva;
                        inicioFila = personaNueva;
                    } else {
                        // Insertar al final
                        finFila.siguiente = personaNueva;
                        personaNueva.anterior = finFila;
                        finFila = personaNueva;
                    }
                    System.out.println("\nFila actual (de inicio a fin):");
                    imprimirLista(inicioFila);
                    break;

                case 2:
                    if (inicioFila != null) {
                        System.out.println("Atendiendo a: " + inicioFila.nombre);
                        inicioFila = inicioFila.siguiente;
                        if (inicioFila != null)
                            inicioFila.anterior = null;
                        else
                            finFila = null; // Si ya no hay nadie
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    imprimirLista(inicioFila);
                    break;

                case 3:
                    System.out.print("¿A quién quieres eliminar? ");
                    String elimina = sc.nextLine(); 
                    Persona buscado = inicioFila;

                    while (buscado != null && !buscado.nombre.equalsIgnoreCase(elimina)) {
                        buscado = buscado.siguiente;
                    }

                    if (buscado != null) {
                        System.out.println(buscado.nombre + " fue eliminado de la fila.");

                        // Caso 1: eliminar al inicio
                        if (buscado.anterior == null) {
                            inicioFila = buscado.siguiente;
                            if (inicioFila != null)
                                inicioFila.anterior = null;
                            else
                                finFila = null;
                        }
                        // Caso 2: eliminar al final
                        else if (buscado.siguiente == null) {
                            finFila = buscado.anterior;
                            finFila.siguiente = null;
                        }
                        // Caso 3: eliminar en medio
                        else {
                            buscado.anterior.siguiente = buscado.siguiente;
                            buscado.siguiente.anterior = buscado.anterior;
                        }
                    } else {
                        System.out.println("No se encontró a " + elimina + " en la fila.");
                    }

                    imprimirLista(inicioFila);
                    break;

                case 4:
                    System.out.println("\nFila en orden inverso (de fin a inicio):");
                    imprimirListaInversa(finFila);
                    break;

                case 5:
                    System.out.println("\nServicio terminado.");
                    int contador = 0;
                    while (inicioFila != null) {
                        contador++;
                        inicioFila = inicioFila.siguiente;
                    }
                    System.out.println("Clientes no atendidos: " + contador);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opc != 5);       
    
    
}
 
 /**
     * Imprime la lista desde el inicio hasta el final.
     */
    public static void imprimirLista(Persona persona) {
        if (persona == null) {
            System.out.println("La fila está vacía.");
            return;
        }
        while (persona != null) {
            System.out.print(persona.nombre);
            if (persona.siguiente != null) System.out.print(" -> ");
            persona = persona.siguiente;
        }
        System.out.println();
    }

    /**
     * Imprime la lista desde el final hasta el inicio (inverso).
     */
    public static void imprimirListaInversa(Persona persona) {
        if (persona == null) {
            System.out.println("La fila está vacía.");
            return;
        }
        while (persona != null) {
            System.out.print(persona.nombre);
            if (persona.anterior != null) System.out.print(" <- ");
            persona = persona.anterior;
        }
        System.out.println();
    }
}

/**
 * Clase Persona: nodo de la lista doblemente enlazada
 */
class Persona {
    String nombre;
    Persona siguiente;
    Persona anterior;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }
}