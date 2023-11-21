/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.util.Map;
import java.io.Serializable;
/**
 *
 * @author Home
 */
public final class CestaParticular extends Cesta implements Serializable{
    
    //Constructor
    
    /**Se crea una cesta particular
     * 
     */
    public CestaParticular() {
        System.out.println("se ha creado una cestaP");
    }
    
    
    //Métodos
    
    /** Suma el precio de la cesta
     * 
     * @return total de la suma del precio de los elementos de la cesta
     */
    @Override
    public double sumaPrecios() {
        double total = 0.0;
        for (Comida comida: super.getComidasObj()) { //preguntar a gonzalo si uso metodo get o no
            String nombre = comida.getTitulo();
            Integer cant = super.getCantComidas().get(nombre);
            total += comida.getPrecio()*cant;
        }
        this.setPrecio(total); 
        return total;    
    }

    /** Muestra por pantalla los elementos de la cesta
     * 
     */
    @Override
    public void mostrarCesta() {
        System.out.println("El precio de la cesta es: "+this.getPrecio() + " e incluye: ");
        for (Map.Entry<String, Integer> c : this.getCantComidas().entrySet()) {
            System.out.println(c.getKey() + " " + c.getValue());
        }
    }    

    
}
