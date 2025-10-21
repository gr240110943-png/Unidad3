
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
        do{
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Cliente enojado");
            System.out.println("4. Terminar servicio");
            opc = Integer.parseInt(sc.nextLine()); 
            switch(opc){
                case 1: 
                    System.out.println("Dame un nombre:");
                    String nombre = sc.nextLine(); 
                    Persona personaNueva = new Persona(); 
                    personaNueva.nombre = nombre;
                    if(inicioFila == null)
                        inicioFila = personaNueva; 
                    else {
                        Persona siguiente = inicioFila;
                        while(siguiente.vieneAtras != null){
                            siguiente = siguiente.vieneAtras; 
                        }
                        siguiente.vieneAtras =personaNueva; 
                    }
                    imprimirLista(inicioFila);
                    break; 
                case 2: 
                    if(inicioFila!=null)
                        inicioFila = inicioFila.vieneAtras;
                    imprimirLista(inicioFila); 
                    break; 
                case 3: 
                    System.out.println("A quien quieres eliminar:");
                    String elimina = sc.nextLine(); 
                    Persona buscado = inicioFila; 
                    Persona atras = null;
                    while(!buscado.nombre.equals(elimina) 
                            && buscado!=null){
                        atras = buscado; 
                        buscado = buscado.vieneAtras; 
                    }
                    //  caso 1 
                    if(buscado!=null){
                        //caso 1 
                        if(atras == null) inicioFila = inicioFila.vieneAtras;
                        else if(buscado.vieneAtras == null) atras.vieneAtras=null; 
                        else atras.vieneAtras = buscado.vieneAtras; 
                    }
                case 4: 
            }
        }while(opc!=4);        
    
    
}
 
public static void imprimirLista(Persona persona){
        if(persona != null){
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
        }
    }
}

class Persona{
    String nombre; 
    Persona vieneAtras; 
}
