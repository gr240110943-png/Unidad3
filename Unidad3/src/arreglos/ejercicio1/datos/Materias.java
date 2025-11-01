/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.ejercicio1.datos;

/**
 *
 * @author coby_
 */
public class Materias {
    
    public String nombre; 
    public int calificacion; 
    public int semestre; 

    public Materias(String nombre, int calificacion, int semestre) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.semestre = semestre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public String[] aArreglo(){
        String[] arreglo = new String[3]; 
        arreglo[0] = nombre;
        arreglo[1] = "" + semestre; 
        arreglo[2] = "" + calificacion; 
        return arreglo; 
      }

    public void setMateria(String materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
