
package p2;

import p2.*;
/**
 *
 * @author Andres
 */
public class Nodo_Arbol {
    public char dato;
    public Nodo_Arbol izquierdo;
    public Nodo_Arbol derecho;
    public listaDobleEnlazada listaDeProductos;       //lista que almacena los productos
    
    public Nodo_Arbol(char datos){
        dato=datos;
        izquierdo = null;
        derecho = null;
        listaDeProductos = new listaDobleEnlazada();
    }
    public Nodo_Arbol getizquierdo(){
        return izquierdo;
    } 
    public Nodo_Arbol getderecho(){
        return derecho;
    }
    public char getdato(){
        return dato;
    }
    public void setizquierdo(Nodo_Arbol nuevoizquierdo){
        izquierdo=nuevoizquierdo;
    }
    public void setderecho(Nodo_Arbol nuevoderecho){
        derecho=nuevoderecho;
    }
    public void setdato(char nuevodato){
        dato=nuevodato;
    }
    public void print_Nodo_Arbol(){
        System.out.println(dato+" Iz: "+izquierdo.dato+" De: "+derecho.dato);
    }
}
