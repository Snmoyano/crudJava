/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author nicolas
 */
public class Alumnos {

    /**
     *Atributo nombre que recibe un String.
     */
    public String nombre;

    /**
     *Atributo edad que recibe un Integer.
     */
    public int edad;

    /**
     * Este constructor nos permite igualar los paramatros a cada atributo.
     * @param nombre
     * @param edad
     */
    public Alumnos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
