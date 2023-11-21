package poo.javaeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public abstract class Cesta {
    
    //Atributos
    
    /** Atributo donde se almacena el precio de la cesta */
    private double precio;
    
    /** Atributo para almacenar las comidas de la cesta */
    private ArrayList<Comida> comidasObj; 
    
    /** Atributo para almacenar la cantidad de comidas en un hashmap con la clave 
        el nombre de la comida y el valor la cantidad de comidas*/
    private HashMap<String, Integer> cantComidas;  
    
    //Constructor
    
    /**Crea una cesta inicializada desde cero
     * 
     */
    public Cesta() {
        this.precio = 0;
        this.cantComidas = new HashMap<>();
        this.comidasObj = new ArrayList<>();
    }
    
    //Métodos (Getter & Setter)
    
    /** Devuelve el precio de la cesta despues de calcular la suma del precio de sus
     *  elementos
     * 
     * @return Precio de la cesta
     */
    public double getPrecio() {
        this.sumaPrecios(); // calculamos la suma de todos los elementos de la cesta
        return precio;
    }

    /**Establece el precio de la cesta
     * 
     * @param precio nuevo precio de la cesta
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     /** Obtiene un hash map con el nombre de la comida y su cantidad
     * 
     * @return hashmap con la clave el nombre de la comida y como valor su cantidad
     */
    public HashMap<String, Integer> getCantComidas() {
        HashMap<String,Integer> hm =new HashMap<>(cantComidas);
        return hm;
    }

    /** Obtiene las comidas seleccionadas en la cesta
     * 
    *@return comidas seleccionadas en la cesta
    */
    public ArrayList<Comida> getComidasObj() {
        return comidasObj;
    }

    /** Establece una lista con las comidas de la cesta
     * 
     * @param comidasObj nuevas comidas de la cesta
     */
    public void setComidasObj(ArrayList<Comida> comidasObj) {
        this.comidasObj = comidasObj;
    }

    /**Establece un hashmap con el nombre de las comidas y su cantidad
     * 
     * @param cantComidas hashmap con el nombre de las comidas y su cantidad
     */
    public void setCantComidas(HashMap<String, Integer> cantComidas) {
        this.cantComidas = cantComidas;
    }
    
    /**annade una cantidad de una comida al HashMap de cantidad de comidas 
     * 
     * @param comida Comida a la que hay  que annadir  cantidad al hashmap de cantidad
     * @param cantidad  Cantidad a añadir de una comida
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
    
    /** elimina una cantidad de una comida del HashMap de cantidad de comidas
     * 
     * @param comida Comida de la que hay  que eliminar una cantidad del hashmap de cantidad
     * @param cantEliminar Cantidad a eliminar de una comida
     */
    public void deleteComida(Comida comida, Integer cantEliminar) {
        if (cantComidas.containsKey(comida.getTitulo())) {
            int cantActual = cantComidas.get(comida.getTitulo());
            if ((0 < cantEliminar) && (cantEliminar < cantActual)) {
                cantComidas.put(comida.getTitulo(), cantActual - cantEliminar);
            }
            else if  (cantEliminar.equals(cantActual)) {
                cantComidas.remove(comida);
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
    
    /** Vacia la cesta inicializandola a cero
     * 
     */
    public void vaciarCesta() {
        comidasObj.clear();
        cantComidas.clear();
        setPrecio(0);
    }
    
    public abstract double sumaPrecios();
    public abstract void mostrarCesta();
    
    
}
