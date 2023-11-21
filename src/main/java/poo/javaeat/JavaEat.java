/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.javaeat;

import java.time.LocalDate;
import java.util.ArrayList;
import poo.javaeat.interfaz.VentanaPrincipal;

/**
 *
 * @author Home
 */
public class JavaEat {
//probrar getCalificacion y set sin poner nada antes
    public static void main(String[] args) {
        /**Direccion d1 = new Direccion("burgos",7,"19005","Guadalajara" );
        Tarjeta t1 = new Tarjeta("Enrique","jdjdj", LocalDate.of(2026, 2, 5));
        CestaParticular cesta =new CestaParticular();
        Particular p1 = new Particular("03212238N","Enrique",d1,t1,"jksdks","admin","ealmira@gmail.es",cesta);
        Comida c1 = new Comida("Tortilla","Patata, Cebolla, Huevo", 12.3, "imagenes/perfil.png");
             
        Comida c2 = new Comida("Paella","Arroz, pescado, Agua", 15.5, "imagenes/JavaEatLogo.png");
        ArrayList<Comida>comidas =new ArrayList<>();
        comidas.add(c1); comidas.add(c2);
        Restaurante res1 = new Restaurante("Casa Pepe","32349FD",d1,"Casero",2.5,15,true,comidas);
        ClaseUtil.altaRestaurante(res1);
        ClaseUtil.annadirComida(res1, c1);//es provisional(falta implementarlo bien en clase util)
        ClaseUtil.addComida(c1);
        res1.addComida(c2);
        //res1.moveComida(c2);
        //res1.moveComida(c2);
        p1.addComida(c1,3);
        p1.addComida(c1,5);
        System.out.println(p1.getCesta().sumaPrecios());
        p1.getCesta().mostrarCesta();
        p1.moveComida(c1, 2);
        p1.getCesta().mostrarCesta();
        p1.realizarPedido(res1);
        Servicio s1 = new Servicio("Camareros",800);
        Servicio s2 = new Servicio("Cocineros",1000);
        Servicio s3 = new Servicio("Decoración",500);
        CestaEmpresa cestaE =new CestaEmpresa ();
        Empresa emp1 = new Empresa("dfkgj","dfujgds","dfjs",d1,t1,"kjdj","admin","empresa@gmail.es",cestaE);
        Catering cat1 = emp1.crearCatering();
        emp1.addServicio(cat1, s3);
        emp1.addEspacio(cat1);
        //emp1.moveEspacio(cat1);
        //emp1.addCatering(cat1);
        emp1.addComida(c1, 4);
        emp1.moveComida(c1,1);
        emp1.moveCatering(cat1); //No hay catering en cesta
        emp1.addComidaACatering(c2, 3, cat1);
        emp1.deleteComidaCatering(c2, 1, cat1);
        emp1.addCatering(cat1); //Se annade catering en cesta
        //emp1.moveCatering(cat1); //Se quita catering de cesta
        System.out.println(cat1.getPrecio());
        cat1.mostrarCatering();
        System.out.println(emp1.getCesta().getPrecio());
        emp1.getCesta().mostrarCesta();
        emp1.realizarPedido(res1);
        
        ClaseUtil.altaRestaurante(res1);
        ClaseUtil.annadirUsuario(p1);
        ClaseUtil.annadirUsuario(emp1);
       
        /**ClaseUtil.saveDataCom();
        ClaseUtil.saveDataPed();
        ClaseUtil.saveDataUsu();
        ClaseUtil.saveDataRes();*/
      ClaseUtil.cargarDatos();
        
        System.out.println(ClaseUtil.getPedidos().toString());
        
        //Ejecutamos la interfaz
       VentanaPrincipal principal = new VentanaPrincipal();
       principal.setVisible(true);
       principal.setLocationRelativeTo(null); //poner al revés
       ClaseUtil.guardarDatos();
    }
}
