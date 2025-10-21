
package arreglosAsociativos;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo1 {
    public static void main(String[] args) {
        // Crear el HashMap
        Map<String, String> persona = new HashMap<>();

        // Agregar elementos
        persona.put("nombre", "Ana");
        persona.put("edad", "25");
        persona.put("ciudad", "Guadalajara");
        persona.put("correo","Ana@gmail.com");

        // Acceder a los elementos
        System.out.println("Nombre: " + persona.get("nombre"));
        System.out.println("Edad: " + persona.get("edad"));
        System.out.println("Ciudad: " + persona.get("ciudad"));
        // Verificar si una clave existe
        if (persona.containsKey("correo")) {
            System.out.println("Correo: " + persona.get("correo"));
        } else {
            System.out.println("No se encontró la clave 'correo'.");
        }
    }
}


