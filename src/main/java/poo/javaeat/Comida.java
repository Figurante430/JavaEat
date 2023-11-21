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
public class Comida implements Serializable {
    //Atributos
    
    /** Atributo para guardar el nombre de la comida*/
    private String titulo;
    
    /** Atributo para guardar los ingredientes de la comida*/
    private String ingredientes;
    
    /** Atributo para guardar el precio de la comida*/
    private double precio;
    
    /** Atributo para guardar la ruta de la imagen de la comida*/
    private String ruta;
    //foto
    
    //Constructor
    
    /** Crea un objeto de comida
     * 
     * @param titulo nombre de la comida
     * @param ingredientes ingredientes de la comida
     * @param precio precio de la comida
     * @param ruta  ruta de la imagen de la comida
     */
    public Comida(String titulo, String ingredientes, double precio, String ruta) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.ruta=ruta;
        System.out.println("se ha creado una comida");
    }
    
    //Métodos

    /**Devuelve el nombre de la comida
     * 
     * @return nombre de la comida
     */
    public String getTitulo() {
        return titulo;
    }

    /**Establece el titulo de la comida
     * 
     * @param titulo titulo de la comida
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Devuelve los ingredientes de la comida
     * 
     * @return ingredientes
     */
    public String getIngredientes() {
        return ingredientes;
    }

    /**Establece los ingredientes de la comida
     * 
     * @param ingredientes ingredientes
     */
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    /** Devuelve el precio de la comida
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /** Establece el precio de la comida
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** Devuelve la ruta de la imagen de una comida
     * 
     * @return  ruta
     */
    public String getRuta() {
        return ruta;
    }

    /** Establece la ruta de la imagen de la comida
     * 
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    /**Imprime por pantalla el nombre, ingredientes y precio de comida
     * 
     * @return Informacion de la comida
     */
    @Override
    public String toString() {
        return "Comida{" + "titulo=" + titulo + ", ingredientes=" + ingredientes + ", precio=" + precio + '}';
    }
    
}
