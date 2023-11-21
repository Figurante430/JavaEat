/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;
/**
 *
 * @author enriq
 */
public class Pedido implements Serializable{
    
    //Atributo
    
    /** Atributo para guardar la fecha del pedido */
    private LocalDateTime fechaPedido;
    
    /** Atributo para guardar los datos del restaurante */
    private Restaurante restaurante; 
    
    /** Atributo para guardar los datos del clienet*/
    private Cliente cliente; 
     
    
    //Datos de cesta
    
    /** Atributo para guardar el precio de la cesta*/
    private double precio;
    
    /** Atributo para guardar las comidas de la cesta*/
    private ArrayList<Comida> comidasObj;
    
    /** Atributo para guardar las comidas y sus cantidades de la cesta*/
    private HashMap<String, Integer> cantComidas;
    
    /** Atributo para guardar el catering de la cesta*/
    private Catering catering;
    
    
    //Costructor (Distinto constructor en función del tipo de cesta
    
    /**Se crea un pedido para empresa
     * 
     * @param res
     * @param e 
     */
    public Pedido(Restaurante res, Empresa e) {
        this.fechaPedido = LocalDateTime.now();
        this.restaurante = res;
        this.cliente = e;
        CestaEmpresa cesta = e.getCesta();
        this.precio = cesta.getPrecio()*0.9;
        this.comidasObj = cesta.getComidasObj();
        this.cantComidas = new HashMap<String,Integer>(cesta.getCantComidas());
        if (cesta.getCatering() != null) {
            this.catering = cesta.getCatering();
        }
        System.out.println("se ha creado un pedidoE");
    }
    
    /**Se crea un pedido para particular
     * 
     * @param res
     * @param p 
     */
    public Pedido(Restaurante res, Particular p) { 
        this.fechaPedido = LocalDateTime.now();
        this.restaurante = res;
        this.cliente=p;
        CestaParticular cesta =p.getCesta();
        this.precio = cesta.getPrecio();
        this.comidasObj = cesta.getComidasObj();
        this.cantComidas = new HashMap<String,Integer>(cesta.getCantComidas());
        System.out.println("se ha creado un pedidoP");
    }
    
    
    //Métodos (Getter && Setter)
    /**Devuelve la fecha del pedido
     * 
     * @return fecha del pedido
     */
    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    /**Establece la fecha del pedido
     * 
     * @param fechaPedido 
     */
    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**Devuleve el restaurante
     * 
     * @return restaurante
     */
    public Restaurante getRestaurante() {
        return restaurante;
    }
    
    /**Establece el restaurante
     * 
     * @param restaurante 
     */
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    /**Devuelve el cliente
     * 
     * @return clienet
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**Establece el cliente
     * 
     * @param cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /**Devuelve el precio 
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**Establece el precio
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**Devuelve una copia de la cantidad de comidas
     * 
     * @return 
     */
    public HashMap<String, Integer> getCantComidas() {
        HashMap<String,Integer> hm =new HashMap<>(cantComidas);
        return hm;
    }

    /**Devuelve las comidas del pedido
     * 
     * @return 
     */
    public ArrayList<Comida> getComidasObj() {
        return comidasObj;
    }

    /**Devuelve el catering del pedido
     * 
     * @return catering
     */
    public Catering getCatering() {
        return catering;
    }

    /**Establece el catering dle pediod
     * 
     * @param catering 
     */
    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    /**Imprime la informacion del pedido
     * 
     * @return info del pedido
     */
    @Override
    public String toString() {
        return "Pedido{" + "fechaPedido=" + fechaPedido + ", restaurante=" + restaurante + ", cliente=" + cliente + ", precio=" + precio + ", comidasObj=" + comidasObj + ", cantComidas=" + cantComidas + ", catering=" + catering + '}';
    }
    
}
