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
public abstract class Cliente extends Usuario implements Serializable{
    
    //Atributos
    
    /** Atributo para almacenar el nombre del cliente*/
    private String nombre;
    
    /** Atributo para almacenar la direeccion del cliente*/
    private Direccion direccion;
    
    /** Atributo para almacenar la tarjeta del cliente*/
    private Tarjeta tarjeta;
    
    /** Atributo para almacenar el telefono del cliente*/
    private String telf;
    
    //Constructor
    
    /**Se crea un objeto cliente 
     * 
     * @param nombre nombre del cliente
     * @param direccion direccion del cliente
     * @param tarjeta tarjeta del cliente
     * @param telf telefono del cliente
     * @param clave contrasenna del cliente
     * @param correo correo del cliente
     */
    public Cliente(String nombre, Direccion direccion, Tarjeta tarjeta, String telf, String clave, String correo) {
        super(correo, clave);
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.telf = telf;
    }
    
    //Métodos: cambiar datos personales
    
    /** Devuelve el nombre del cliente
     * 
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /** Establece el nombre dle cliente
     * 
     * @param nombre  nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve ka direccion del cliente
     * 
     * @return direccion del cliente
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**Establece la direccion del cliente
     * 
     * @param direccion direccion del cliente
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /** Devuelve la tarjeta del cliente
     * 
     * @return tarjeta del cliente
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**Establece la tarjet del cliente
     * 
     * @param tarjeta tarjeta del cliente
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /** Devuelve el telefono del cliente
     * 
     * @return telefono del cliente
     */
    public String getTelf() {
        return telf;
    }
    
    /** Establece el telefono del cliente
     * 
     * @param telf telefono del cliente
     */
    public void setTelf(String telf) {
        this.telf = telf;
    }

    /**Imprime por pantalla el nombre, direccion, tarjeta y telefono del cliente
     * 
     * @return Informacion del cliente
     */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccion=" + direccion + ", tarjeta=" + tarjeta + ", telf=" + telf + '}';
    }
    
    public abstract void vaciarCesta();
    public abstract void realizarPedido(Restaurante res);
}
