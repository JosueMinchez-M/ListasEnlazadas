package com.mycompany.listasenlazadas;

/**
 *
 * @author joshua
 */
public class Lista {
    Nodo inicio, fin; //Punteros, para acceder al inicio y al fin de la lista. Estas son referencias
    int cont = 0;
    public Lista(){
        inicio = null;
        fin = null;
    }
    //Método que nos permite saber si la lista esta vacia o no.
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //Método para agregar elementos al inicio de la lista.
    public void agregandoAlInicio(String d){
        cont++;
        if(estaVacia()){
            inicio = new Nodo(d, inicio);
            fin = inicio;
        }else{
            inicio = new Nodo(d, inicio);
        }
    }
    
    //Método que nos dice cuantos elementos se encuentran en la lista.
    public int cantidadNodos(){
        return cont;
    }
    //Método mostrar lista.
    public void mostrarLista(){
       Nodo aux = inicio;
       while(aux != null){
           System.out.print("[" + aux.dato + "]");
           aux = aux.siguiente;
       }
    }
}
