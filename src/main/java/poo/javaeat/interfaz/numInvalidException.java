/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat.interfaz;

/**
 *
 * @author Home
 */
public class numInvalidException extends Exception{
    public numInvalidException() {
        super("Cantidad incorrecta, inténtalo de nuevo");
    }
    
    public numInvalidException(String mensaje) {
        super(mensaje);
    }
}
