/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;
import java.io.Serializable;
/**
 *
 * @author Home
 */
public class Servicio implements Serializable{
    
    //Atributos
    
    /** Atributo para guardar el nombre de un servicio*/
    private String nombre;
    
    /** Atributo para almacenar el precio de un servicio*/
    private double precio;
    
    //Constructor
    
    /** Crea un objeto servicio
     * 
     * @param nombre
     * @param precio 
     */
    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("se ha creado un servicio");
    }
    
    
    //Métodos(Geter && Setter)
    
    /** Devuelve el nombre de un servicio
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Establece el nombre de un servicio
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve el precio de un servicio
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /** Establece el precio a un servicios
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
