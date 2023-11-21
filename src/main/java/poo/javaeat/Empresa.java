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
public class Empresa extends Cliente implements Serializable{
    //Atributos
    
    /**Atributo para almacenar el cif de una empresa */
    private String CIF;
    
    /**Atributo para almacenar la webde una empresa */
    private String web;
    
    /**Atributo para almacenar la cesta de una empresa */
    private CestaEmpresa cesta;
    
    
    //Constructor
    
    /** Crea una empresa
     * 
     * @param CIF
     * @param web
     * @param nombre
     * @param direccion
     * @param tarjeta
     * @param telf
     * @param clave
     * @param correo
     * @param cesta 
     */
    public Empresa(String CIF, String web, String nombre, Direccion direccion, Tarjeta tarjeta, String telf, String clave, String correo, CestaEmpresa cesta) {
        super(nombre, direccion, tarjeta, telf, clave, correo);
        this.CIF = CIF;
        this.web = web;
        this.cesta = cesta;
        System.out.println("se ha creado un empresa");
    }
    
    
    //Métodos (Getter && Setter)
    /** Devuelve el cif de una empresa
     * 
     * @return cif
     */
    public String getCIF() {
        return CIF;
    }

    /**Establece el cif de una empresa
     * 
     * @param CIF 
     */
    public void setCIF(String CIF) { //se puede cambiar CIF??
        this.CIF = CIF;
    }

    /**Devuelve la web de una empresa
     * 
     * @return web
     */
    public String getWeb() {
        return web;
    }

    /**Establece la web de una empresa
     * 
     * @param web 
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**Devuelve la cesta de la empresa
     * 
     * @return cestaE
     */
    public CestaEmpresa getCesta() {
        return cesta;
    }

    /**Establece la cesta de la empresa
     * 
     * @param cesta 
     */
    public void setCesta(CestaEmpresa cesta) {
        this.cesta = cesta;
    }

    
    //Más métodos
    /**Crear un catering 
     * 
     * @return catering
     */
    public Catering crearCatering() {
        Catering catering = new Catering(); //Elijo pedir catering (voy a crearlo cunado selecciono opc catering, y luego le voy anndiendo cosas cuando le de al boton de annadir a la cesta)
        return catering;
    }
    
    /**Annadir catering a la cesta
     * 
     * @param catering 
     */
    public void addCatering(Catering catering){ 
        this.getCesta().setCatering(catering);
        System.out.println("Se ha annadido el catering a la cesta");
    }
    
    /**Eliminar catering de la cesta
     * 
     * @param catering 
     */
    public void moveCatering(Catering catering){
        if(this.getCesta().getCatering()!= null) {
            this.getCesta().setCatering(null);
            System.out.println("Se ha eliminado el catering de la cesta");
        }
        else {
            System.out.println("No hay ningun catering en la cesta");
        }
    }
    
    /** annadir servicio al catering
     * 
     * @param catering
     * @param servicio 
     */
    public void addServicio(Catering catering, Servicio servicio) {
        catering.addServicio(servicio);
    }
    
    /** eliminar servicio del catering
     * 
     * @param catering
     * @param servicio 
     */
    public void moveServicio(Catering catering, Servicio servicio) {
        catering.moveServicio(servicio);
    }
    
    /** annadir espacio privado al catering
     * 
     * @param catering 
     */
    public void addEspacio(Catering catering) {
        catering.setEspacioPrivado(true);
        System.out.println("Se ha annadido el espacio privado al catering");
    }
    
    /** Eliminar el espacio privado del catering
     * 
     * @param catering 
     */
    public void moveEspacio(Catering catering) {
        catering.setEspacioPrivado(false);
        System.out.println("Se ha eliminado espacio privado de catering");
    }
    
    /**Annadir cantidades de comida al hashmap de cesta
     * 
     * @param comida
     * @param cant 
     */
    public void addComida(Comida comida, Integer cant) {
        this.getCesta().addComida(comida, cant);
    }
    
    /**Eliminar comida del hashmap de cesta
     * 
     * @param comida
     * @param cant 
     */
    public void moveComida(Comida comida, Integer cant) { 
        this.getCesta().deleteComida(comida, cant);
    }
    
    /** se le añade una cantidad de comida al catering
     * 
     * @param comida
     * @param cantidad
     * @param catering 
     */
    public void addComidaACatering(Comida comida, Integer cantidad, Catering catering) {
        catering.addComida(comida, cantidad);
    }
    
    /**se elimina una cantidad de comidas del catering
     * 
     * @param comida
     * @param cantidad
     * @param catering 
     */
    public void deleteComidaCatering(Comida comida, Integer cantidad, Catering catering) {
        catering.deleteComida(comida, cantidad);
    }
   
    //annadir comida //plantear como clase abstracto (metodo realizar pedido y addComida)

    /**Se realiza un pedido
     * 
     * @param res 
     */
    @Override
    public void realizarPedido(Restaurante res) {
        Pedido pedido = new Pedido(res, this); 
        ClaseUtil.annadirPedido(pedido);// SE añade al arry de todos los pedidos
        ClaseUtil.crearFactura(pedido); 
        // Guardar datos
        ClaseUtil.guardarDatos();
        //Vaciar cesta
        this.vaciarCesta();
        
    }
    /**Se vacia la cesta
     * 
     */
    @Override
    public void vaciarCesta() {
        moveCatering(cesta.getCatering());
        this.cesta.vaciarCesta();
    }
    
    /**Imprime el cif, web y cesta de una empresa
     * 
     * @return informacion de empresa
     */
    @Override
    public String toString() {
        return "Empresa{" + "CIF=" + CIF + ", web=" + web + ", cesta=" + cesta + '}';
    }
    
}
