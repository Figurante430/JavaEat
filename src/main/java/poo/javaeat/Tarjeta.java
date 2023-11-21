/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.time.LocalDate;
import java.io.Serializable;
/**
 *
 * @author Home
 */
public class Tarjeta implements Serializable {
    //Atributos
    
    /** Atributo  para almacenar el titular de una tarjeta*/
    private String titular;
    
    /** Atributo para almacenar el numero de una tarjeta*/
    private String numero;
    
    /** Atributo para almacenar la fecha de caducidad de una tarjeta*/
    private LocalDate fechaCad;
    
    //Constructor

    /** Crea un objeto de tipo tarjeta
     * 
     * @param titular
     * @param numero
     * @param fechaCad 
     */
    public Tarjeta(String titular, String numero, LocalDate fechaCad) {
        this.titular = titular;
        this.numero = numero;
        this.fechaCad = fechaCad; //Corregir para poner una fecha mas adelante, no el día que se crea
        System.out.println("se ha creado un tarjeta");
    }
    
    //Métodos

    /**Devuelve el titular de la tarjeta
     * 
     * @return titular
     */
    public String getTitular() {
        return titular;
    }

    /**Establece el titular de la tarjeta
     * 
     * @param titular 
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /** Devuelve el numero de la tarjeta
     * 
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /** Establece el numero de la tarjeta
     * 
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /** Devuelve la fecha de caducidad de la tarjeta
     * 
     * @return fechaCad
     */
    public LocalDate getFechaCad() {
        return fechaCad;
    }

    /** Establece la fecha de caducidad de la tarjeta
     * 
     * @param fechaCad 
     */
    public void setFechaCad(LocalDate fechaCad) {
        this.fechaCad = fechaCad;
    }

    /** Devuelve la informacion de la tarjeta (titular, numero y fechaCad)
     * 
     * @return informacion de la tarjeta
     */
    @Override
    public String toString() {
        return "Tarjeta{" + "titular=" + titular + ", numero=" + numero + ", fechaCad=" + fechaCad + '}';
    }
    
    
    
}
