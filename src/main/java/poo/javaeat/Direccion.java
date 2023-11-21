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
public class Direccion implements Serializable{
    //Atributos
    
    /** Atributo para guardar la calle de la direccion*/
    private String calle;
    
    /** Atributo para guardar el numero de la direccion*/
    private int numero;
    
    /** Atributo para guardar el codigo postal de la direccion*/
    private String CP;
    
    /** Atributo para guardar la ciudad de la direccion*/
    private String ciudad;
    
    //Constructor
    
    /**Crea un objeto direccion
     * 
     * @param calle
     * @param numero
     * @param CP
     * @param ciudad 
     */
    public Direccion(String calle, int numero, String CP, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.CP = CP;
        this.ciudad = ciudad;
        System.out.println("se ha creado una direccion");
    }
    
    //Métodos

    /** Devuelve la calle de la direccion
     * 
     * @return calle
     */
    public String getCalle() {
        return calle;
    }

    /**Establece la calle de la direccion
     * 
     * @param calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**Devuelve el numero de la direccion
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /** Establece el numero de la direccion
     * 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**Devuelve el codigo postal de la direccion
     * 
     * @return cp
     */
    public String getCP() {
        return CP;
    }
    
    /**Establece el numero de la direccion
     * 
     * @param CP 
     */
    public void setCP(String CP) {
        this.CP = CP;
    }

    /**Devuelve la ciudad de la direccion
     * 
     * @return ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /** Establece la ciudad de la direccion
     * 
     * @param ciudad 
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /** Imprime la calle, el numero, el CP y la ciudad de la direccion
     * 
     * @return informacion de la direccion
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", CP=" + CP + ", ciudad=" + ciudad + '}';
    }
    
}
