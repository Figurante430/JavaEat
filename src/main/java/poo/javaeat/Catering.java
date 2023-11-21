package poo.javaeat;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class Catering implements Serializable{
    
    //Atributos
    
    /** Atributo para almacenar las comidas del catering*/
    private ArrayList<Comida> comidasObj;
    
    /** Atributo para almacenar la cantidad de comidas en un hashmap con la clave 
        el nombre de la comida y el valor la cantidad de comidas*/
    private HashMap<String, Integer> cantComidas;
    
    /** Atributo para almacenar los servicios seleccionados en el catering */
    private ArrayList<Servicio> serviciosSeleccionados;
    
    /** Atributo para saber si se ha contratado espacio privado */
    private boolean espacioPrivado;
    
    /** Atributo para almacenar el precio del catering */
    private double precio;
    
    //Constructor
    
    /** Crea un catering inicializado desde cero
     * 
     */
    public Catering() {
        this.comidasObj = new ArrayList<>();
        this.cantComidas = new HashMap<>();
        this.serviciosSeleccionados = new ArrayList<>();
        this.espacioPrivado = false;
        this.precio = 0;
        System.out.println("se ha creado un catering"); //Primero creamos el catering y le vamos annadiendo las cosas
    }
    
    
    //Métodos (Getter && Setter)
    
    /** Obtiene las comidas seleccionadas en el catering
     * 
    *@return comidas seleccionadas en el catering
    */
    public ArrayList<Comida> getComidasObj() {
        return comidasObj;
    }
    
    /** Obtiene un hash map con el nombre de la comida y su cantidad
     * 
     * @return hashmap con la clave el nombre de la comida y como valor su cantidad
     */
    public HashMap<String, Integer> getCantComidas() {
        HashMap<String,Integer> hm =new HashMap<>(cantComidas);
        return hm;
    }
    
    /**Obtiene el precio del catering
     * 
     * @return el precio del catering
     */
    public double getPrecio() {
        this.sumaPrecios(); // calculamos la suma de todos los elementos del catering
        return precio;
    }
    
    /**Establece el precio del catering
     * 
     * @param precio Precio del catering
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**Devuelve si el catering tiene espacio privado
     * 
     * @return booleano
     */
    public boolean isEspacioPrivado() {
        return espacioPrivado;
    }

    /** Establece si hay contratado un espacio privado y llama a la funcion de sumar los precios
     * 
     * @param espacioPrivado 
     */
    public void setEspacioPrivado(boolean espacioPrivado) {
        this.espacioPrivado = espacioPrivado;
        sumaPrecios();
    }
    
    /**Devuelve una lista con los servivios seleccionados
     * 
     * @return lista de servicios seleccionados
     */
    public ArrayList<Servicio> getServiciosSeleccionados(){
        return serviciosSeleccionados;
    }
    
    /**annade un servicio al ArrayList de servicios y suma los precios de todo
     * 
     * @param servicio Servicio a annadir
     */
    public void addServicio(Servicio servicio) {
        
        if(!serviciosSeleccionados.contains(servicio)) {
            serviciosSeleccionados.add(servicio);
            System.out.println("Servicio annadido correctamente");
        }
        else {
            System.out.println("No se ha podido annadir el servicio, ya estaba incluido");
        }
        sumaPrecios();
    }
    
    /**elimina un servicio del ArrayList de servicios y suma los precios de todo
     * 
     * @param servicio  Servicio a eliminar
     */
    public void moveServicio(Servicio servicio) {
        
        if (serviciosSeleccionados.contains(servicio)) {
            serviciosSeleccionados.remove(servicio);
            System.out.println("Se ha eliminado el servicio");
        }
        else {
            System.out.println("No se ha podido eliminar, no estaba incluido en el catering");
        }
        sumaPrecios();
    }
    
    /**Se annade una cantidad de una comida al Hashmap de comidas seleccionadas en el catering y se suma el precio de todo
     * 
     * @param comida Nombre de la comida a annadir
     * @param cantidad Cantidad de la comida a annadir 
     */
    public void addComida(Comida comida, Integer cantidad) {
        
       if (!cantComidas.containsKey(comida.getTitulo())){
            comidasObj.add(comida);
            cantComidas.put(comida.getTitulo(), cantidad); //Preguntar si la implementamos solo en clase util pq se repuite aqui y en catring
        }
        else {
            cantComidas.put(comida.getTitulo(), cantidad + cantComidas.get(comida.getTitulo()));
        }
        System.out.println("Se ha annadido correctamente");
        sumaPrecios(); 
    }
    
    /**Se elimina  una  cantidad de una comida del Hashmap de comidas seleccionadas en el catering y se suma el precio de todo
     * 
     * @param comida Nombre de la comida a eliminar
     * @param cantEliminar Cantidad de la comida a eliminar 
     */
    public void deleteComida(Comida comida, Integer cantEliminar) {
        
        if (cantComidas.containsKey(comida.getTitulo())) {
            int cantActual = cantComidas.get(comida.getTitulo());
            if ((0 < cantEliminar) && (cantEliminar < cantActual)) {
                cantComidas.put(comida.getTitulo(), cantActual - cantEliminar);
            }
            else if  (cantEliminar.equals(cantActual)) {
                cantComidas.remove(comida.getTitulo());
                comidasObj.remove(comida);
            }
            else {
                System.out.println("No se puede eliminar una cantidad negativa");
            }
        }
        else {
            System.out.println("No se encontró la comida");
        }
        sumaPrecios();
    }
    
    
    //Otros Métodos
    
    /**Suma el precio de todos los elementos que forman el catering
     * 
     * @return Coste total del catering
     */
    public double sumaPrecios() {
        double total = 0;
        for (Comida comida: this.getComidasObj()) { //preguntar a gonzalo si uso metodo get o no
            String nombre = comida.getTitulo();
            Integer cant = this.getCantComidas().get(nombre);
            total += comida.getPrecio()*cant;
        }
        for (Servicio servicio: this.getServiciosSeleccionados()) {
            total += servicio.getPrecio();
        }
        if (espacioPrivado) {
            total += 1000;
        }
        this.precio = total;
        return total;
    }
    
    /** Saca por pantalla todos los elementos que contiene el catering
     * 
     */
    public void mostrarCatering() {
        System.out.println("El catering contien: ");
        for (Map.Entry<String, Integer> c : this.getCantComidas().entrySet()) {
            System.out.println(c.getKey() + " " + c.getValue());
        }
        if (serviciosSeleccionados != null) {
            for (Servicio servicio: this.getServiciosSeleccionados()) {
                System.out.println(servicio.getNombre() + ": " + servicio.getPrecio());
            }
        }
        if (espacioPrivado) {
            System.out.println("Espacio Privado: 1000");
        }   
    }

    @Override
    /** Imprime  el array de comidas seleccionadas, el hashmap de cantidad de comidas, el array de 
     * servicios, si hay contatado espacio privado y el precio del catering
     * 
     * @return Informacion del catering
     */
    public String toString() {
        return "Catering{" + "comidasObj=" + comidasObj + ", cantComidas=" + cantComidas + ", serviciosSeleccionados=" + serviciosSeleccionados + ", espacioPrivado=" + espacioPrivado + ", precio=" + precio + '}';
    } 
} 

