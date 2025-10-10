
package retos.reto1;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 * programa que permite ingresar 3 numeros
 * y devuelve el valor del numero menor
 * 10/octubre/2025
 */
public class Pregunta12 {
    
     public static void main (String[] args){
         
         Scanner leer=new Scanner(System.in);
        byte n1,n2,n3;
        System.out.print("Introduzca el primer valor: ");
        n1=leer.nextByte();
        System.out.print("Introduzca el segundo valor: ");
        n2=leer.nextByte();
        System.out.print("Introduzca el tercer valor: ");
        n3=leer.nextByte();
        
        
        if(n1>n2){
            if(n1>n3){
            System.out.println("El mayor es: "+n1);
        }
            else {
                    System.out.println("El mayor es: "+n3);
                    }
    }
        else{
            if(n2>n3){
                System.out.println("El mayor es: "+n2);
            }
            else{
                System.out.println("El mayor es: "+n3);
            }
        }
         
         
     }
}
     
    /* public static int getNumeroMenor (int n1, int n2, int n3){
         
           if(n1<n2){
            if(n1<n3){
            return n1;
        }
            else {
                    return n3;
                    }
    }
        else{
            if(n2<n3){
                return +n2;
            }
            else{ return n3;
            }
        }
    
}
*/