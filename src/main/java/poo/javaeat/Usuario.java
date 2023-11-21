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
public class Usuario implements Serializable{
    
    //Atributos 
    
    /** Atributo para guardar la contraseña de un usuario*/
    private String clave;
    
    /** Atributo para guardar el correo de un usuario*/
    private String correo;
    
    //Constructor

    /** Crea un objeto de tipo usuario
     * 
     * @param correo
     * @param clave 
     */
    public Usuario(String correo, String clave) {
        this.clave = clave;
        this.correo = correo;
    }
    
    //Getter && Setter

    /** Devuelve la contraseña del usuario
     * 
     * @return clave
     */
    public String getClave() {
        return clave;
    }

    /** Establece la contraseña de un usuario
     * 
     * @param clave 
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /** Devuelve el correo de un usuario
     * 
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**Estabelce el correo de un usuario
     * 
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
