
package retos.reto1;

/**
 *
 * @author Cinthia
 * programa en el que se aplica la recursividad
 * que imprime los numero inversos y termina en el numero 
 * que es ungresado Ejemplo: se ingresa 4 y se imrime 4,3,2,1
 */

import java.util.Scanner;

public class Pregunta13 {
    public static void imprimir (int n){
        
        if(n>0){
            System.out.println(n+"");
            imprimir (n-1);
            
        }
        
    }
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        imprimir(n);
    }
}
