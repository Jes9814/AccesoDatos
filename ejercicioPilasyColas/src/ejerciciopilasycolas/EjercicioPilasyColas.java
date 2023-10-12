/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopilasycolas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jeslo
 */
public class EjercicioPilasyColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue <Objeto> cola = iniciarCola();
        LinkedList <Objeto> pila = iniciarPila();
        Objeto prueba = new Objeto();
        Objeto Paco = new Objeto("Paco", 12);
        Objeto Jose = new Objeto("Jose", 20);
        
        llenarPila(pila, Paco);
        llenarCola(cola, Jose);
        
         for (Objeto o : pila){
             System.out.println(o.toString());
          }
         
         for (Objeto o : cola){
             System.out.println(o.toString());
          }
         
        System.out.println("Abajo debe salir false");
        pilaesVacia(pila);
        colaesVacia(cola);
        
        System.out.println(buscarObjPila(pila, Jose));
        System.out.println(buscarObjPila(pila, Paco));
        
        vaciarPila(pila);
        System.out.println(pilaesVacia(pila));
    }
    
    public static Queue <Objeto> iniciarCola(){
        Queue <Objeto> cola = new LinkedList <Objeto>();
        return cola;
    }
    
    public static LinkedList <Objeto> iniciarPila(){
        LinkedList <Objeto> pila = new LinkedList <Objeto>();
        return pila;
    }
    
     public static void llenarPila(LinkedList <Objeto> pila, Objeto obj){
        pila.push(obj);
    }
     
     public static void llenarCola(Queue <Objeto> cola, Objeto obj){
        cola.add(obj);
    }
    
     public static void vaciarPila(LinkedList <Objeto> pila){
        pila.remove();
    }
     
     public static void vaciarCola(Queue <Objeto> cola){
        cola.remove();
    }
     
      public static boolean pilaesVacia(LinkedList <Objeto> pila){       
        return pila.isEmpty();
    }
     
     public static boolean colaesVacia(Queue <Objeto> cola){
        return cola.isEmpty();
     }
     
      public static String buscarObjPila(LinkedList <Objeto> pila, Objeto obj){  
          for (Objeto o : pila){
              if(o.getEdad() == obj.getEdad() && o.getNombre() == obj.getNombre()){
              return "Existe en la cola";
              } 
          }
          return "No existe en la cola";
    }
     
     public static String buscarObjCola(Queue <Objeto> cola, Objeto obj){
          for (Objeto o : cola){
              if(o.equals(obj.getEdad()) && o.equals(obj.getNombre())){
              return "Existe en la cola";
              } 
          }
          return "No existe en la cola";
     }
     
    
}
