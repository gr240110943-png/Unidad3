
package arreglos;

/**
 *
 * @author Cinthia
 * Ejercicio para explicar los arreglos
 * 
 */

import java.util.*;

public class Tabla {
    
     public static void main (String[] args){
        
        int arreglo[] = new int[20];
        int[] arreglo2 = {4,3,2,1,2};
        int matriz[][] = new int[3][4];
        int[] matriz2[] = {{2,4,2},{1,2,3}};
        
        System.out.println("Valor " +matriz2[1][2]);
         
        System.out.println("La matriz tine: " + matriz2.length);
         
        System.out.println(matriz2.length);
        
        System.out.println("El primer arreglo tiene: "+arreglo.length+" posiciones");
        
        System.out.println("El segundo arreglo tiene: "+arreglo2.length+" posiciones");        
   
        String[][] datos =new String[5][3];
        
        Scanner sc = new Scanner(System.in);
 
        for (int i = 0; i < 5; i++) {
 
             System.out.println("Nombre: ");
             var nombre =sc.nextLine();
             System.out.println("Carrera");
             var carrera = sc.nextLine();
             System.out.println("Edad");
             var edad = sc.nextLine();
             
             datos[i][0]=nombre;
             datos[i][1]=carrera;
             datos[i][2]=edad;
         
         }
        
    }
    
     public static void drawLinea(){
        
         for(int x = 0; x < 80; x++)
        System.out.print("-");
    System.out.println();

         
    }
     
}
