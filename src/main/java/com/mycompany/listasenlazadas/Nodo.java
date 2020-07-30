/*Cada vez que creamos un nuevo objeto de la clase Nodo,
estamos creando un nuevo nodo.*/
package com.mycompany.listasenlazadas;

/**
 *
 * @author joshua
 */
public class Nodo {
    
    String dato;
    Nodo siguiente;
    
    public Nodo(String d, Nodo sig){
        dato = d;
        siguiente = sig;
    }
}
