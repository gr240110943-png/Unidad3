package ejercicioPilas;

/**
 *Programa que me permite trabajar con los datos en formato LIFO
 * es una pila estatica para manipular datos
 * @author Cinthia
 */

import javax.swing.JOptionPane;

public class MiStack {
    
    private String[] pila; // Arreglo que almacena los elementos de la pila
    int tope;      // Índice del último elemento (tope)
    private int max;       // Tamaño máximo de la pila

    // Constructor
    public MiStack(int tam) {
        max = tam;
        pila = new String[max];
        tope = -1; // pila vacía al inicio
    }

    // Inserta un nuevo elemento (PUSH)
    public void push(String dato) {
        if (estaLlena()) {
            JOptionPane.showMessageDialog(
                null,
                "La pila está llena, no se puede agregar más elementos.",
                "Pila llena",
                JOptionPane.WARNING_MESSAGE
            );
        } else {
            tope++;
            pila[tope] = dato;
        }
    }

    // Elimina y devuelve el último elemento (POP)
    public String pop() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(
                null,
                "La pila está vacía, no hay elementos para eliminar.",
                "Pila vacía",
                JOptionPane.WARNING_MESSAGE
            );
            return null;
        } else {
            String dato = pila[tope];
            pila[tope] = null; // limpiar visualmente
            tope--;
            return dato;
        }
    }

    // Devuelve el elemento en el tope sin eliminarlo (PEEK)
    public String peek() {
        if (estaVacia()) {
            return null;
        } else {
            return pila[tope];
        }
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return tope == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return tope == max - 1;
    }

    // Devuelve el tamaño actual (número de elementos)
    public int tamaño() {
        return tope + 1;
    }

    // Muestra el contenido de la pila (para depuración o consola)
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Contenido de la pila:");
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
    }
}
