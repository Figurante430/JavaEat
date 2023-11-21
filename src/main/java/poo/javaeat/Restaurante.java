/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author Home
 */
public class Restaurante implements Serializable{
    //Atributos
    
    /** Atributo para almacenar el nombre de una empresa */
    private String nombre;
    
    /** Atributo para almacenar el cif de una empresa */
    private String CIF;
    
    /** Atributo para almacenar la direccion de una empresa */
    private Direccion dir;
    
    /** Atributo para almacenar la especialidad de una empresa */
    private String especialidad;
    
    /** Atributo para almacenar la calificacion de una empresa */
    private double calificacion;
    
    /** Atributo para almacenar los gastos de envio de una empresa */
    private double gastosEnvio;
    
    /** Atributo para almacenar el tiempo de envio de una empresa */
    private int tiempoEspera; 
    
    /** Atributo para almacenar el catering de una empresa */
    private boolean catering;
    
    /** Atributo para almacenar las comidas de una empresa */
    private ArrayList<Comida> comidas;
    
    /** Atributo para almacenar las calificaciones de una empresa */
    private ArrayList<Integer> calificaciones;
    
    //Constructor
    
    /** Crea un objeto empresa
     * 
     * @param nombre
     * @param CIF
     * @param dir
     * @param especialidad
     * @param gastosEnvio
     * @param tiempoEspera
     * @param catering
     * @param comidas 
     */
    public Restaurante(String nombre, String CIF, Direccion dir, String especialidad, double gastosEnvio, int tiempoEspera, boolean catering, ArrayList<Comida> comidas) { //Corregir duration a minutos(conversion)
        this.nombre = nombre;
        this.CIF = CIF;
        this.dir = dir;
        this.especialidad = especialidad;
        this.gastosEnvio = gastosEnvio;
        this.tiempoEspera = tiempoEspera;
        this.catering = catering;
        this.calificaciones = new ArrayList<>();
        this.comidas = comidas;
        System.out.println("se ha creado un restaurante");
    }
    
    
    //Métodos
    //modificaciones del restaurantes (más platos...) lo hace el restaurante o el admin?? Igual que cliente, podría hacer él mismo sus cambios (platos, catering...) 
    // podría solicitar cambio para hacer catering, en ese caso, sería complicado si hubiera 2 clases hijas de restaurante (con/sin)

    //Métodos
    
    /**Devuleve el nombre del restaurante
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    
    /**Establece el nombre de un restaurante
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve el CIF del restaurante
     * 
     * @return cif
     */
    public String getCIF() {
        return CIF;
    }

    /** Establece el cif de un restaurante
     * 
     * @param CIF 
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /** Devuelve la direccion de un restaurante
     * 
     * @return dir
     */
    public Direccion getDir() {
        return dir;
    }

    /** Establece la direccion de un restaurante
     * 
     * @param dir 
     */
    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    /** DEvuelve la especialidad de un restaurante
     * 
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /** Establece la especialidad de un restaurante
     * 
     * @param especialidad 
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /** Devuelve la calificacion de un restaurante
     * 
     * @return calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /** Establece la calificacion de un restaurante
     * 
     * @param calificacion 
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /** Devuelve los gastos de envio del restaurante
     * 
     * @return gastos de envio
     */
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    /**Establece los gastos de envio de un restaurante
     * 
     * @param gastosEnvio 
     */
    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    /** Devuelve el tiempo de espera de envio del restaurante
     * 
     * @return tiempo de espera
     */
    public int getTiempoEspera() {
        return tiempoEspera;
    }

    /** Establece el tiempo de espera de envio de un restaurante
     * 
     * @param tiempoEspera 
     */
    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    /** Devuelve un booleano para saber si el restaurante tiene opcion a catering
     * 
     * @return 
     */
    public boolean isCatering() {
        return catering;
    }

    /** Establece el booleano de catering 
     * 
     * @param catering 
     */
    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    /** Devuelve el arraylist de comidas del restaurante
     * 
     * @return comidas
     */
    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    /**Devuelve el array de calificaciones del restaurante
     * 
     * @return calificaciones
     */
    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }
    
    /**  Establece la calificacion del restaurante haciendo la media de las anteriores
     *   con una nueva calificacion
     * 
     * @param nota Nueva calificacion
     */
    public void calificar(int nota) {
        calificaciones.add(nota);
        int total = 0;
        for (Integer calificacion: calificaciones) {
            total += calificacion;
        }
        double notaFin =(double) total/calificaciones.size();
        this.setCalificacion(notaFin);
        
    }
    
    /** Annade una comida al arraylist del restaurante 
     * 
     * @param comida 
     */
    public void addComida(Comida comida) {
        if (!comidas.contains(comida)) {
            this.comidas.add(comida);
            System.out.println("Se ha annadido correctamente");
        }
        else {
            System.out.println("Ya está en la carta del restaurante");
        }                                 //Es provisional hasta implementarlo en clase util      
    }
    
    /** Elimina una comida del arraylist del restaurante 
     * 
     * @param comida 
     */
    public void moveComida(Comida comida) {
        if(comidas.contains(comida)) {
            this.comidas.remove(comida);
            System.out.println("Se ha elimnado de la carta correctamente");
        }
        else {
            System.out.println("No se ha eliminado de la carta porque no estaba en ella");
        }
    }
    
    /** Devuelve la informacion del restaurante como un string
     * 
     * @return informacion del restaurante
     */
    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", CIF=" + CIF + ", dir=" + dir + ", especialidad=" + especialidad + ", calificacion=" + calificacion + ", gastosEnvio=" + gastosEnvio + ", tiempoEspera=" + tiempoEspera + ", catering=" + catering + ", comidas=" + comidas + '}';
    }
    
}
