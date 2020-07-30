package com.mycompany.listasenlazadas;

/**
 *
 * @author joshua
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.agregandoAlInicio("Juan");
        miLista.agregandoAlInicio("Ana");
        miLista.agregandoAlInicio("Lupita");
        miLista.agregandoAlInicio("María");
        miLista.agregandoAlInicio("Mariano");
        miLista.agregandoAlInicio("Javier");
        miLista.agregandoAlInicio("Anelisse");
        miLista.mostrarLista();
        
        if(miLista.estaVacia()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("  La lista no está vacía");
        }
        
        System.out.println("Cantidad de elementos de la lista enlazada: " + miLista.cantidadNodos());
    }
    
}
