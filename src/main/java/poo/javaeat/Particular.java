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
public class Particular extends Cliente implements Serializable{
    //Atributos
    
    /**atributo para guardar el DNI */
    private String DNI;
    
    /** atributo para guardar la cesta*/
    private CestaParticular cesta;
    
    //Constructor
    
    /**Se crea un particular
     * 
     * @param DNI
     * @param nombre
     * @param direccion
     * @param tarjeta
     * @param telf
     * @param clave
     * @param correo
     * @param cesta 
     */
    public Particular(String DNI, String nombre, Direccion direccion, Tarjeta tarjeta, String telf, String clave, String correo, CestaParticular cesta) {
        super(nombre, direccion, tarjeta, telf, clave, correo);
        this.DNI = DNI;
        this.cesta = cesta; //Hacemos una composicion de clases
        System.out.println("se ha creado un particular");
    }
    
    //Métodos: cambiar datos personales

    /**Devuelve el DNI del particular
     * 
     * @return dni
     */
    public String getDNI() {
        return DNI;
    }

    /** Establece el DNI del particular
     * 
     * @param DNI 
     */
    public void setDNI(String DNI) { //se puede cambiar DNI??
        this.DNI = DNI;
    }
    
    /** Devuelve la cesta del particular
     * 
     * @return cesta
     */
    public CestaParticular getCesta() {
        return cesta;
    }
    
    /** Se añade una cantidad de comidas a la cesta
     * 
     * @param comida
     * @param cant 
     */
    public void addComida(Comida comida, int cant) {
        this.getCesta().addComida(comida, cant);
    }
    
    /** Se elimina una cantidad de comidas de la cesta
     * 
     * @param comida
     * @param cant 
     */
    public void moveComida(Comida comida, Integer cant) { 
        this.getCesta().deleteComida(comida, cant);
    }
    
    /**Se realiza un pedido
     * 
     * @param res 
     */
    @Override
    public void realizarPedido(Restaurante res) {
       Pedido pedido = new Pedido(res, this);
        ClaseUtil.annadirPedido(pedido); //// SE añade al arry de todos los pedidos
        ClaseUtil.crearFactura(pedido);
        //Se guardan los datos
        ClaseUtil.guardarDatos();
        this.vaciarCesta();
        
    }
  
    /**Se imprime el dni y la cesta del particular
    * 
    * @return informacion del particular
    */
    @Override
    public String toString() {
        return "Particular{" + "DNI=" + DNI + ", cesta=" + cesta + '}';
    }
    
    /**Se vacia la cesta
     * 
     */
    @Override
    public void vaciarCesta() {
        this.cesta.vaciarCesta();
    }
    

    
    
    
    
}
