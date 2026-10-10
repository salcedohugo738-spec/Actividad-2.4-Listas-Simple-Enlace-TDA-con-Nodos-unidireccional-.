/*
Morales Escobar Juan Adrian
Salcedo Alvarez Hugo Emmanuel
 */
package Nodos;

import back_end.Pagina;

/**
 * Capa 2 - Nodo de la lista: guarda el record de datos y el enlace al
 * siguiente nodo.
 */
public class Nodo {

    private final Pagina dato;
    private Nodo siguiente;

    public Nodo(Pagina dato) {
        if (dato == null) {
            throw new IllegalArgumentException("El dato del nodo no puede ser nulo.");
        }
        this.dato = dato;
        this.siguiente = null;
    }

    public Pagina getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
