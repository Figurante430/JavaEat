/**
 *
 * @author enriq
 */
package poo.javaeat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.time.Duration;
import java.time.LocalDateTime;

public class ClaseUtil {
    
    /**Atributo para guardar todos los restaurantes*/
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    
    /**Atributo para guardar todas las comidas*/
    private static ArrayList<Comida> comidas = new ArrayList<>();
    
    /**Atributo para guardar todos los pedidos*/
    private static ArrayList<Pedido> pedidos =new ArrayList<>();
    
    /**Atributo para guardar todos los clientes*/
    private static ArrayList<Cliente> usuarios = new ArrayList<>();
    
    /** Atributo para guardar un restaurante */
    private static Restaurante res;
    
    /** Atributo para guardar una comida */
    private static Comida com;
    
    /**Inicializamos los atributos que representan a todos los servicios*/
    public static Servicio camareros = new Servicio("Camareros", 800);
    public static Servicio cocineros = new Servicio("Cocineros", 1000);
    public static Servicio decoracion = new Servicio("Decoración", 500);
    
    
    //Métodos (Getter && Setter)
    
    /**Establece el arrayList de todos los restaurantes
     * 
     * @param r arrayList de todos los restaurantes
     */
    public static void setRestaurantes (ArrayList<Restaurante> r){
        restaurantes = r;
    }

    /** Devuelve el arrayList de todas las comidas
     * 
     * @return ArrayList de todas las comidas
     */
    public static ArrayList<Comida> getComidas() {
        return comidas;
    }

    /** Establece el arrayList de todas las comidas
     * 
     * @param comidas arrayList de todas las comidas
     */
    public static void setComidas(ArrayList<Comida> comidas) {
        ClaseUtil.comidas = comidas;
    }

    /** Devuelve el arrayList de todos los pedidos
     * 
     * @return ArrayList de todas los pedidos
     */
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /** Establece el arrayList de todos los pedidos
     * 
     * @param pedidos arrayList de todos los pedidos
     */
    public static void setPedidos(ArrayList<Pedido> pedidos) {
        ClaseUtil.pedidos = pedidos;
    }

    /** Devuelve el arrayList de todos los usuarios
     * 
     * @return ArrayList de todas los usuarios
     */
    public static ArrayList<Cliente> getUsuarios() {
        return usuarios;
    }

    /** Establece el arrayList de todos los usuarios
     * 
     * @param usuarios arrayList de todos los usuarios
     */
    public static void setUsuarios(ArrayList<Cliente> usuarios) {
        ClaseUtil.usuarios = usuarios;
    }

    /** Devuelve el restaurante
     * 
     * @return restaurante
     */
    public static Restaurante getRes() {
        return res;
    }
    
    /** Establece el restaurnate
     * 
     * @param res Restaurante
     */
    public static void setRes(Restaurante res) {
        ClaseUtil.res = res;
    }

    /** Devuelve la comida
     * 
     * @return comida
     */
    public static Comida getCom() {
        return com;
    }

    /** Establece la comida
     * 
     * @param com COmida
     */
    public static void setCom(Comida com) {
        ClaseUtil.com = com;
    }
  
    /** Devuelve el arrayList de todos los restaurantes
     * 
     * @return ArrayList de todas los restaurantes
     */
    public static ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }
    
    /** Ordena el arrayList de los restaurantes por cercania a un cliente (criterio:
     *  que compartan los cuatro primeros numero del cp)
     * 
     * @param c CLiente con el que se va a comparar la cercania
     * @return  ArrayList ordenado por cercania
     */
    public static ArrayList<Restaurante> ordenarCercania (Cliente c){
        String cPostalRefe = c.getDireccion().getCP();
        Comparator CercComp = new Comparator() {
        @Override
        public int compare (Object o1, Object o2){
            Restaurante r1 = (Restaurante) o1;
            Restaurante r2 = (Restaurante) o2;
            String cp2 = r2.getDir().getCP();
            String cp1 = r1.getDir().getCP();
            int cifrasCoincidentes1 = getCifrasCoincidentes (cPostalRefe,cp1);
            int cifrasCoincidentes2 = getCifrasCoincidentes (cPostalRefe,cp2);
            return Integer.compare(cifrasCoincidentes2, cifrasCoincidentes1);               
        }   
        private int getCifrasCoincidentes(String codigo1, String codigo2) {
        int cifrasCoincidentes = 0;
        for (int i = 0; i < codigo1.length(); i++) {
            if (codigo1.charAt(i) == codigo2.charAt(i)) {
                cifrasCoincidentes++;} 
            else {
                break;
            }
        }
        return cifrasCoincidentes;}
        };
        ArrayList<Restaurante> r=new ArrayList<>(restaurantes);
        Collections.sort(r,CercComp);
        return r;
    }
    
    /**Filtra el arraylist segun una especialidad, eliminando los restaurantes que 
     *  no son de esa especialidad
     * 
     * @param array Arrayque se pretende filtrar
     * @param especialidad Especialidad que se pretende filtrar
     * @return  ArrayList filtrado por especialidad
     */
    public static ArrayList<Restaurante> filtroEspecialidad (ArrayList<Restaurante> array,String especialidad){
        return (ArrayList<Restaurante>) array.stream().filter(rest -> rest.getEspecialidad().equals(especialidad)).collect(Collectors.toList());
    }
    
    /** Ordena el arrayList de los restaurantes por sus calificaciones
     * 
     * @return  ArrayList ordenado por calificaciones
     */
    public static ArrayList<Restaurante> ordenarRelevancia(){

        return (ArrayList<Restaurante>) restaurantes.stream().sorted((r1,r2) -> Double.compare(r1.getCalificacion(), r2.getCalificacion())).collect(Collectors.toList());
        
    }
    
    /** Ordena el arrayList de los restaurantes por su tiempo medio de envio
     * 
     * @return  ArrayList ordenado por tiempo medio de envio
     */
    public static ArrayList<Restaurante> ordenarTMedio(){
        return (ArrayList<Restaurante>) restaurantes.stream().sorted((r1,r2) -> Double.compare(r1.getTiempoEspera(), r2.getTiempoEspera())).collect(Collectors.toList());
    }
    
    /** Ordena el arrayList de los restaurantes por si tienen catering o no
     * 
     * @return  ArrayList ordenado por catering
     */
    public static ArrayList<Restaurante> ordenarCatering(){
        return (ArrayList<Restaurante>) restaurantes.stream().sorted((r1,r2)->Boolean.compare(r1.isCatering(),r2.isCatering())).collect(Collectors.toList());
    }
    
    /**Introducir un restaurante en el array de todos los restaurantes
     * 
     * @param res Restaurante a introducir
     * @return  Booleano para saber si se ha introducido o no
     */
    public static boolean altaRestaurante (Restaurante res){
        if (restaurantes.contains(res)){return false;}
        else{
            restaurantes.add(res);
            return true;
        }
    }
    
    /**Eliminar un restaurante del array de todos los restaurantes
     * 
     * @param res Restaurante a eliminar
     * @return  Booleano para saber si se ha eliminado o no
     */
    public static boolean bajaRestaurante (Restaurante res){
        if (!restaurantes.contains(res)){return false;}
        else{
            restaurantes.remove(res);
            return true;
        }
    }
    
    /**Modifica los datos de un restaurante
     * 
     * @param res Restaurante que se quiere modificar
     * @param nombre Nombre del restaurante
     * @param CIF CIF del restaurante
     * @param dir direccion del restaurante
     * @param especialidad especialidad del restaurante
     * @param calificacion calificacion del restaurante
     * @param gastosEnvio gastos de envio del restaurante
     * @param tiempoEspera tiempo de envio del restaurante
     * @param catering Booleano para saber si el restaurante tiene catering o no
     * @return Booleano para saber si se ha modificado o no
     */
    public static boolean modificaRestaurante (Restaurante res,String nombre, String CIF, Direccion dir, String especialidad, double calificacion, double gastosEnvio, int tiempoEspera, boolean catering){
        if (res==null || !restaurantes.contains(res)){
            return false;
        }
        else{
            res.setNombre(nombre);
            res.setCIF(CIF);
            res.setDir(dir);
            res.setEspecialidad(especialidad);
            res.setGastosEnvio(gastosEnvio);
            res.setTiempoEspera(tiempoEspera);
            res.setCatering(catering);
            res.setCalificacion(calificacion);
            return true;
        }
    }
    
    /**Se añade una comida al restaurante 
     * 
     * @param res restaurante al que se quiere annadir la comida
     * @param com comida que se quiere annadir al restaurante
     * @return Booleano para saber si se ha annadido o no
     */
    public static boolean annadirComida (Restaurante res, Comida com){
        if (res==null || !restaurantes.contains(res) || com == null){
            return false;
        }
        else {
            res.addComida(com);
            return true;
        }
    }
    
    /**Se elimina una comida al restaurante 
     * 
     * @param res restaurante al que se quiere eliminar la comida
     * @param com comida que se quiere eliminar del restaurante
     * @return Booleano para saber si se ha eliminado o no
     */
    public static boolean quitarComida (Restaurante res, Comida com){
        if (res==null || !restaurantes.contains(res) || com == null){
            return false;
        }
        else {
            res.moveComida(com);
            return true;
        }
    }
    
    /**Introducir un cliente  en el array de todos los clientes
     * 
     * @param c Cliente a introducir
     * @return  Booleano para saber si se ha introducido o no
     */
    public static boolean annadirUsuario (Cliente c){
        if (usuarios.contains(c)){return false;}
        else{
            usuarios.add(c);
            return true;
        }
    }
    
    /**Introducir un pedido en el array de todos los pedidos
     * 
     * @param ped Pedido a introducir
     * @return  Booleano para saber si se ha introducido o no
     */
    public static boolean annadirPedido (Pedido ped){
        if (pedidos.contains(ped)){return false;}
        else{
            pedidos.add(ped);
            return true;
        }
    }
    
    /**Introducir una comida en el array de todos las comidas
     * 
     * @param c Comida a introducir
     * @return  Booleano para saber si se ha introducido o no
     */
    public static boolean addComida(Comida c) {
        if (comidas.contains(c)) {
            return false;
        }
        else {
            comidas.add(c);
            return true;
        }
    }
    
    /**Eliminar una comida del array de todos las comidas
     * 
     * @param c Comida a eliminar
     * @return  Booleano para saber si se ha eliminado o no
     */
    public static boolean deleteComida(Comida c) {
        if (comidas.contains(c)) {
            return false;
        }
        else {
            comidas.remove(c);
            return true;
        }
    }
    
    /**buscar usuarios de la aplicacion (saber si están o no registrados)
     * 
     * @param users Array de usuarios de la app
     * @param correo correo de la persona a encontrar
     * @return marca (-1 no registrado, otra registrado)
     */
    public static int isRegistrado(ArrayList<Cliente> users, String correo) { 
       
        int i = 0;
        while(i < users.size()) {
            if (users.get(i++).getCorreo().equals(correo)) {
                return i-1;
            }
        }
       return -1;
    }
    
    /** Carga los datos de los restaurantes a partir de un fichero
     * 
     */
    public static void loadDataRes () {
        try {
            try (FileInputStream IStream = new FileInputStream ("cpsegrestaurantes.dat")){
                ObjectInputStream oisres = new ObjectInputStream(IStream);
                restaurantes = (ArrayList) oisres.readObject();
            }
        }
        catch (IOException e){ System.out.println("Error: " + e.getMessage());}
        catch (ClassNotFoundException eo){ System.out.println("Error: "+ eo.getMessage());}        
    }
    
    /** Carga los datos de las comidas a partir de un fichero
     * 
     */
    public static void loadDataCom () {
        try {
            try (FileInputStream IStream = new FileInputStream ("cpsegcomidas.dat")){
                ObjectInputStream oiscom = new ObjectInputStream(IStream);
                comidas = (ArrayList) oiscom.readObject();
            }
        }
        catch (IOException e){ System.out.println("Error: " + e.getMessage());}
        catch (ClassNotFoundException eo){ System.out.println("Error: "+ eo.getMessage());}   
    }
    
    /** Guarda los datos de los restaurantes en un fichero
     * 
     */
    public static void saveDataRes (){
        try {
            if(!restaurantes.isEmpty()) {
                try (FileOutputStream osres = new FileOutputStream ("cpsegrestaurantes.dat")) {
                    ObjectOutputStream oosres =new ObjectOutputStream (osres);
                    oosres.writeObject(restaurantes);
                }
            } else { System.out.println("Error: no hay restaurantes");}
        } 
        catch (IOException e){
            System.out.println ("Error: "+ e.getMessage());
        }
    }
    /** Guarda los datos de las comidas en un fichero
     * 
     */
    public static void saveDataCom (){
        try {
            if(!comidas.isEmpty()) {
                try (FileOutputStream oscom = new FileOutputStream ("cpsegcomidas.dat")) {
                    ObjectOutputStream ooscom =new ObjectOutputStream (oscom);
                    ooscom.writeObject(comidas);
                }
            } else { System.out.println("Error: no hay comidas");}
        } 
        catch (IOException e){
            System.out.println ("Error: "+ e.getMessage());
        }
    }
    
    /** Carga los datos de los pedidos a partir de un fichero
     * 
     */
    public static void loadDataPed () {
        try {
            try (FileInputStream IStream = new FileInputStream ("cpsegpedidos.dat")){
                ObjectInputStream oisped = new ObjectInputStream(IStream);
                pedidos = (ArrayList) oisped.readObject();
            }
        }
        catch (IOException e){ System.out.println("Error: " + e.getMessage());}
        catch (ClassNotFoundException eo){ System.out.println("Error: "+ eo.getMessage());}
    } 
    
    /** Carga los datos de los usuarios a partir de un fichero
     * 
     */
    public static void loadDataUsu () {
        try {
            try (FileInputStream IStream = new FileInputStream ("cpsegusu.dat")){
                ObjectInputStream oisusu = new ObjectInputStream(IStream);
                usuarios = (ArrayList) oisusu.readObject();
            }
        }
        catch (IOException e){ System.out.println("Error: " + e.getMessage());}
        catch (ClassNotFoundException eo){ System.out.println("Error: "+ eo.getMessage());} 
    }
    
    /** Guarda los datos de las pedidos en un fichero
     * 
     */
    public static void saveDataPed (){
        try {
            if(!pedidos.isEmpty()) {
                try (FileOutputStream osped= new FileOutputStream ("cpsegpedidos.dat")) {
                    ObjectOutputStream oosped =new ObjectOutputStream (osped);
                    oosped.writeObject(pedidos);
                }
            } else { System.out.println("Error: no hay pedidos");}
        } 
        catch (IOException e){
            System.out.println ("Error: "+ e.getMessage());
        }
    }
    
    /** Guarda los datos de los usuarios en un fichero
     * 
     */
    public static void saveDataUsu (){
        try {
            if(!usuarios.isEmpty()) {
                try (FileOutputStream osusu = new FileOutputStream ("cpsegusu.dat")) {
                    ObjectOutputStream oosusu =new ObjectOutputStream (osusu);
                    oosusu.writeObject(usuarios);
                }
            } else { System.out.println("Error: no hay usuarios");}
        } 
        catch (IOException e){
            System.out.println ("Error: "+ e.getMessage());
        }
    }
    
    /**Carga los datos de los ficheros
     * 
     */
    public static void cargarDatos() {
        loadDataCom();
        loadDataUsu();
        loadDataRes();
        loadDataPed();
    }
    
    /**Guarda los datos en ficheros
     * 
     */
    public static void guardarDatos() {
        saveDataCom();
        saveDataUsu();
        saveDataRes();
        saveDataPed();
    }
    
    /** Crea un fichero (factura) a partir de la informacion de un pedido
     * 
     * @param pedido Pedido que da la informacion para hacer la factura
     */
    public static void crearFactura (Pedido pedido){
        LocalDateTime hoy = LocalDateTime.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy/HH/mm/SS");        
        String fecha = hoy.format(formatoCorto);        
        String rutaFactura = "./Facturas/Factura(" + fecha.replace('/', '_') + ").txt";
        Cliente cliente =pedido.getCliente();
        Double total =pedido.getPrecio();
        Double totalCate;
        if (pedido.getCatering()==null) {
            totalCate =0.0;
        }
        else{ totalCate=pedido.getCatering().sumaPrecios();}
        try {
            File directorio = new File ("./Facturas");
            if (!directorio.exists()) {directorio.mkdir();}
            FileWriter fw =new FileWriter (rutaFactura);
            try (PrintWriter pw =new PrintWriter(new BufferedWriter(fw))) {
                pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Factura Pedido~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                pw.println("\n");
                pw.println(cliente.toString());
                pw.println("\n");
                pw.println("-------------------------------- Fecha: " + fecha + " -------------------------------");
                pw.println("\n");
                pw.println(pedido.getRestaurante().toString());
                pw.println("\n");
                for (Comida comida:pedido.getComidasObj()){
                    Integer cant =pedido.getCantComidas().get(comida.getTitulo());
                    pw.println(comida.getTitulo()+" -- Precio: "+comida.getPrecio()+" x"+cant +" ------> "+comida.getPrecio()*cant);
                    pw.println ("\n");
                }
                if (cliente.getClass().getSimpleName().equals("Empresa" )&& pedido.getCatering() != null){
                    Catering ct =pedido.getCatering();
                    for (Comida comida:ct.getComidasObj()){
                    Integer cant =ct.getCantComidas().get(comida.getTitulo());
                    pw.println(comida.getTitulo()+" -- Precio: "+comida.getPrecio()+" x"+cant +" ------> "+comida.getPrecio()*cant);
                    pw.println ("\n");
                    for (Servicio servicio:ct.getServiciosSeleccionados()){
                        pw.println(servicio.getNombre()+" -- Precio: "+servicio.getPrecio());
                        pw.println("\n");
                    }
                    if (ct.isEspacioPrivado()){
                        pw.println("Espacio Privado -- Precio: 1000");
                    }
                    
                }
                pw.println("---------------------------------------------------------------------------------");
                pw.println("\n");
                pw.println("Importe a pagar: "+ total);
                pw.println("\n");
                pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");   
            }
        }
        }
        catch (IOException ioe) {
            System.out.println ("Error: "+ ioe.getMessage());
        }
    }
}
