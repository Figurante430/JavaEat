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
public final class CestaEmpresa extends Cesta implements Serializable{
  
    //Atributos 
    
    /** Atributo para guardar un catering */
    private Catering catering;
    
    //Constructor
    
    /** Crea una cesta de empresa */
    public CestaEmpresa() {
        System.out.println("se ha creado una cestaE");
    }
    
    
    //Métodos (Getter && Setterr)
    
    /** Devuelve el catering de la cesta
     * 
     * @return  catering de la cesta
     */
    public Catering getCatering() {
        return catering;
    }

    /** Establece un catering para la cesta y suma el precio de la cesta
     * 
     * @param catering catering de la cesta 
     */
    public void setCatering(Catering catering) {
        this.catering = catering;
        this.sumaPrecios();
    }
    
    
    //Otros Métodos 
    
    /** Suma el precio de la cesta
     * 
     * @return total de la suma del precio de los elementos de la cesta
     */
    @Override
    public double sumaPrecios() {
        double total = 0.0;
        for (Comida comida: super.getComidasObj()) {
            String nombre = comida.getTitulo();
            Integer cant = super.getCantComidas().get(nombre);
            total += comida.getPrecio()*cant;
        }
        if (catering != null) { 
            total += this.catering.getPrecio();
        }  
        super.setPrecio(total);
        return total;
    }
    
    /** Muestra por pantalla los elementos de la cesta
     * 
     */
    @Override
    public void mostrarCesta() {
        System.out.println("El precio de la cesta es: "+this.sumaPrecios() + " e incluye: ");
        if (super.getComidasObj()!= null)for (Map.Entry<String, Integer> c : this.getCantComidas().entrySet()) {
            System.out.println(c.getKey() + " " + c.getValue());
        }
        if (catering != null) {
            catering.mostrarCatering();
        }
    }
    
    /**Muestra por pantalla los elementos de la cesta de empresa
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "CestaEmpresa{" + "catering=" + catering + '}';
    }
    
    
    
}
